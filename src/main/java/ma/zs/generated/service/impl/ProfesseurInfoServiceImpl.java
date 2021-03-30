package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.ProfesseurInfo;
import ma.zs.generated.bean.Etablissement;
import ma.zs.generated.bean.Utilisateur;
import ma.zs.generated.bean.Formation;
import ma.zs.generated.dao.ProfesseurInfoDao;
import ma.zs.generated.service.facade.ProfesseurInfoService;
import ma.zs.generated.service.facade.FormationService;   
import ma.zs.generated.service.facade.UtilisateurService;   
import ma.zs.generated.service.facade.EtablissementService;   

import ma.zs.generated.ws.rest.provided.vo.ProfesseurInfoVo;
import ma.zs.generated.service.util.*;
@Service
public class ProfesseurInfoServiceImpl implements ProfesseurInfoService {

   @Autowired
   private ProfesseurInfoDao professeurInfoDao;
   
    @Autowired
    private FormationService formationService ;
    @Autowired
    private UtilisateurService utilisateurService ;
    @Autowired
    private EtablissementService etablissementService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<ProfesseurInfo> findAll(){
		return professeurInfoDao.findAll();
	}	
	@Override
	public List<ProfesseurInfo> findByEtablissementRef(String ref){
		return professeurInfoDao.findByEtablissementRef(ref);
	}
	@Override
	@Transactional
    public int deleteByEtablissementRef(String ref){
		return professeurInfoDao.deleteByEtablissementRef(ref);
	}
	
     @Override
    public List<ProfesseurInfo> findByEtablissementId(Long id){
		return professeurInfoDao.findByEtablissementId(id);

	}
	   @Override
	   @Transactional
    public int deleteByEtablissementId(Long id){
		return professeurInfoDao.deleteByEtablissementId(id);

	}
     		
	@Override
	public List<ProfesseurInfo> findByCompteEmail(String email){
		return professeurInfoDao.findByCompteEmail(email);
	}
	@Override
	@Transactional
    public int deleteByCompteEmail(String email){
		return professeurInfoDao.deleteByCompteEmail(email);
	}
	
     @Override
    public List<ProfesseurInfo> findByCompteId(Long id){
		return professeurInfoDao.findByCompteId(id);

	}
	   @Override
	   @Transactional
    public int deleteByCompteId(Long id){
		return professeurInfoDao.deleteByCompteId(id);

	}
     		
	@Override
	public ProfesseurInfo findByCode(String code){
		if( code==null)
		  return null;
		return professeurInfoDao.findByCode(code);
	}

   

	@Override
	@Transactional
	public int deleteByCode(String  code) {
		return professeurInfoDao.deleteByCode(code);	 
	}

	@Override
	public ProfesseurInfo findById(Long id){
		 if(id==null)
		  return null;
		return professeurInfoDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           professeurInfoDao.deleteById(id);
   }
	@Override	
	public ProfesseurInfo save (ProfesseurInfo professeurInfo){
			ProfesseurInfo foundedProfesseurInfo = findByCode(professeurInfo.getCode());
	       if(foundedProfesseurInfo!=null)
	          return null;  
	    
	          if(professeurInfo.getEtablissement()!=null){
				    Etablissement etablissement = etablissementService.findByRef(professeurInfo.getEtablissement().getRef());
				  if(etablissement == null)
				  professeurInfo.setEtablissement(etablissementService.save(professeurInfo.getEtablissement()));
				  else
				  professeurInfo.setEtablissement(etablissement);
			  }
	    
	          if(professeurInfo.getCompte()!=null){
				    Utilisateur compte = utilisateurService.findByEmail(professeurInfo.getCompte().getEmail());
				  if(compte == null)
				  professeurInfo.setCompte(utilisateurService.save(professeurInfo.getCompte()));
				  else
				  professeurInfo.setCompte(compte);
			  }

	    ProfesseurInfo savedProfesseurInfo = professeurInfoDao.save(professeurInfo);
               if(ListUtil.isNotEmpty(professeurInfo.getResponsableDe())){
		  savedProfesseurInfo.setResponsableDe(formationService.save(prepareResponsableDe(savedProfesseurInfo,professeurInfo.getResponsableDe())));
		 }
	   return savedProfesseurInfo;
	}

    @Override
    public List<ProfesseurInfo> save(List<ProfesseurInfo> professeurInfos){
		List<ProfesseurInfo> list = new ArrayList<ProfesseurInfo>();
		for(ProfesseurInfo professeurInfo: professeurInfos){
		        list.add(save(professeurInfo));	
		}
		return list;
	}

     private List<Formation> prepareResponsableDe(ProfesseurInfo professeurInfo,List<Formation> formations){
		    for(Formation formation:formations ){
                  formation.setResponsable(professeurInfo); 
			}
			return formations;
	  }

   @Override
   public ProfesseurInfo update(ProfesseurInfo professeurInfo){
     
    
		  ProfesseurInfo foundedProfesseurInfo = findById(professeurInfo.getId()); 
		       if(foundedProfesseurInfo==null)
	          return null;	  
	  
	   return  professeurInfoDao.save(professeurInfo);
     
     }
    
	@Override
	@Transactional
	public int delete(ProfesseurInfo professeurInfo){

	        if(professeurInfo.getCode()==null)
			  return -1;
		
			ProfesseurInfo foundedProfesseurInfo = findByCode(professeurInfo.getCode());
	       if(foundedProfesseurInfo==null)
	          return -1;  
	   professeurInfoDao.delete(foundedProfesseurInfo);
	   return 1;
	}


	public List<ProfesseurInfo> findByCriteria(ProfesseurInfoVo professeurInfoVo){
      String query = "SELECT o FROM ProfesseurInfo o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "code","LIKE",professeurInfoVo.getCode());

			 query += SearchUtil.addConstraint( "o", "prenom","LIKE",professeurInfoVo.getPrenom());

			 query += SearchUtil.addConstraint( "o", "nom","LIKE",professeurInfoVo.getNom());

		 	 query += SearchUtil.addConstraint( "o", "id","=",professeurInfoVo.getId());
   if(professeurInfoVo.getEtablissementVo()!=null){
     query += SearchUtil.addConstraint( "o", "etablissement.id","=",professeurInfoVo.getEtablissementVo().getId());
     query += SearchUtil.addConstraint( "o", "etablissement.ref","LIKE",professeurInfoVo.getEtablissementVo().getRef());
   }
   
   if(professeurInfoVo.getCompteVo()!=null){
     query += SearchUtil.addConstraint( "o", "compte.id","=",professeurInfoVo.getCompteVo().getId());
     query += SearchUtil.addConstraint( "o", "compte.email","LIKE",professeurInfoVo.getCompteVo().getEmail());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
