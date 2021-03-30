package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.CatDemande;
import ma.zs.generated.dao.CatDemandeDao;
import ma.zs.generated.service.facade.CatDemandeService;

import ma.zs.generated.ws.rest.provided.vo.CatDemandeVo;
import ma.zs.generated.service.util.*;
@Service
public class CatDemandeServiceImpl implements CatDemandeService {

   @Autowired
   private CatDemandeDao catDemandeDao;
   

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<CatDemande> findAll(){
		return catDemandeDao.findAll();
	}	
	@Override
	public CatDemande findByRef(String ref){
		if( ref==null)
		  return null;
		return catDemandeDao.findByRef(ref);
	}

   

	@Override
	@Transactional
	public int deleteByRef(String  ref) {
		return catDemandeDao.deleteByRef(ref);	 
	}

	@Override
	public CatDemande findById(Long id){
		 if(id==null)
		  return null;
		return catDemandeDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           catDemandeDao.deleteById(id);
   }
	@Override	
	public CatDemande save (CatDemande catDemande){
			CatDemande foundedCatDemande = findByRef(catDemande.getRef());
	       if(foundedCatDemande!=null)
	          return null;  

	    CatDemande savedCatDemande = catDemandeDao.save(catDemande);
	   return savedCatDemande;
	}

    @Override
    public List<CatDemande> save(List<CatDemande> catDemandes){
		List<CatDemande> list = new ArrayList<CatDemande>();
		for(CatDemande catDemande: catDemandes){
		        list.add(save(catDemande));	
		}
		return list;
	}


   @Override
   public CatDemande update(CatDemande catDemande){
     
    
		  CatDemande foundedCatDemande = findById(catDemande.getId()); 
		       if(foundedCatDemande==null)
	          return null;	  
	  
	   return  catDemandeDao.save(catDemande);
     
     }
    
	@Override
	@Transactional
	public int delete(CatDemande catDemande){

	        if(catDemande.getRef()==null)
			  return -1;
		
			CatDemande foundedCatDemande = findByRef(catDemande.getRef());
	       if(foundedCatDemande==null)
	          return -1;  
	   catDemandeDao.delete(foundedCatDemande);
	   return 1;
	}


	public List<CatDemande> findByCriteria(CatDemandeVo catDemandeVo){
      String query = "SELECT o FROM CatDemande o where 1=1 ";
		 	 query += SearchUtil.addConstraint( "o", "id","=",catDemandeVo.getId());
			 query += SearchUtil.addConstraint( "o", "ref","LIKE",catDemandeVo.getRef());

			 query += SearchUtil.addConstraint( "o", "libellee","LIKE",catDemandeVo.getLibellee());

	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
