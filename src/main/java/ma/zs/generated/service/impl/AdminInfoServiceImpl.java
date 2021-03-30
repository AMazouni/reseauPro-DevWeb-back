package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.AdminInfo;
import ma.zs.generated.bean.Utilisateur;
import ma.zs.generated.dao.AdminInfoDao;
import ma.zs.generated.service.facade.AdminInfoService;
import ma.zs.generated.service.facade.UtilisateurService;   

import ma.zs.generated.ws.rest.provided.vo.AdminInfoVo;
import ma.zs.generated.service.util.*;
@Service
public class AdminInfoServiceImpl implements AdminInfoService {

   @Autowired
   private AdminInfoDao adminInfoDao;
   
    @Autowired
    private UtilisateurService utilisateurService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<AdminInfo> findAll(){
		return adminInfoDao.findAll();
	}	
	@Override
	public List<AdminInfo> findByCompteEmail(String email){
		return adminInfoDao.findByCompteEmail(email);
	}
	@Override
	@Transactional
    public int deleteByCompteEmail(String email){
		return adminInfoDao.deleteByCompteEmail(email);
	}
	
     @Override
    public List<AdminInfo> findByCompteId(Long id){
		return adminInfoDao.findByCompteId(id);

	}
	   @Override
	   @Transactional
    public int deleteByCompteId(Long id){
		return adminInfoDao.deleteByCompteId(id);

	}
     		
	@Override
	public AdminInfo findByNom(String nom){
		if( nom==null)
		  return null;
		return adminInfoDao.findByNom(nom);
	}

   

	@Override
	@Transactional
	public int deleteByNom(String  nom) {
		return adminInfoDao.deleteByNom(nom);	 
	}

	@Override
	public AdminInfo findById(Long id){
		 if(id==null)
		  return null;
		return adminInfoDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           adminInfoDao.deleteById(id);
   }
	@Override	
	public AdminInfo save (AdminInfo adminInfo){
			AdminInfo foundedAdminInfo = findByNom(adminInfo.getNom());
	       if(foundedAdminInfo!=null)
	          return null;  
	    
	          if(adminInfo.getCompte()!=null){
				    Utilisateur compte = utilisateurService.findByEmail(adminInfo.getCompte().getEmail());
				  if(compte == null)
				  adminInfo.setCompte(utilisateurService.save(adminInfo.getCompte()));
				  else
				  adminInfo.setCompte(compte);
			  }

	    AdminInfo savedAdminInfo = adminInfoDao.save(adminInfo);
	   return savedAdminInfo;
	}

    @Override
    public List<AdminInfo> save(List<AdminInfo> adminInfos){
		List<AdminInfo> list = new ArrayList<AdminInfo>();
		for(AdminInfo adminInfo: adminInfos){
		        list.add(save(adminInfo));	
		}
		return list;
	}


   @Override
   public AdminInfo update(AdminInfo adminInfo){
     
    
		  AdminInfo foundedAdminInfo = findById(adminInfo.getId()); 
		       if(foundedAdminInfo==null)
	          return null;	  
	  
	   return  adminInfoDao.save(adminInfo);
     
     }
    
	@Override
	@Transactional
	public int delete(AdminInfo adminInfo){

	        if(adminInfo.getNom()==null)
			  return -1;
		
			AdminInfo foundedAdminInfo = findByNom(adminInfo.getNom());
	       if(foundedAdminInfo==null)
	          return -1;  
	   adminInfoDao.delete(foundedAdminInfo);
	   return 1;
	}


	public List<AdminInfo> findByCriteria(AdminInfoVo adminInfoVo){
      String query = "SELECT o FROM AdminInfo o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "nom","LIKE",adminInfoVo.getNom());

			 query += SearchUtil.addConstraint( "o", "prenom","LIKE",adminInfoVo.getPrenom());

			 query += SearchUtil.addConstraint( "o", "code","LIKE",adminInfoVo.getCode());

		 	 query += SearchUtil.addConstraint( "o", "id","=",adminInfoVo.getId());
   if(adminInfoVo.getCompteVo()!=null){
     query += SearchUtil.addConstraint( "o", "compte.id","=",adminInfoVo.getCompteVo().getId());
     query += SearchUtil.addConstraint( "o", "compte.email","LIKE",adminInfoVo.getCompteVo().getEmail());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
