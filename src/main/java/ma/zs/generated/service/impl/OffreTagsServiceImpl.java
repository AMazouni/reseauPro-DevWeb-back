package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.OffreTags;
import ma.zs.generated.dao.OffreTagsDao;
import ma.zs.generated.service.facade.OffreTagsService;

import ma.zs.generated.ws.rest.provided.vo.OffreTagsVo;
import ma.zs.generated.service.util.*;
@Service
public class OffreTagsServiceImpl implements OffreTagsService {

   @Autowired
   private OffreTagsDao offreTagsDao;
   

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<OffreTags> findAll(){
		return offreTagsDao.findAll();
	}	
	@Override
	public OffreTags findByRef(String ref){
		if( ref==null)
		  return null;
		return offreTagsDao.findByRef(ref);
	}

   

	@Override
	@Transactional
	public int deleteByRef(String  ref) {
		return offreTagsDao.deleteByRef(ref);	 
	}

	@Override
	public OffreTags findById(Long id){
		 if(id==null)
		  return null;
		return offreTagsDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           offreTagsDao.deleteById(id);
   }
	@Override	
	public OffreTags save (OffreTags offreTags){
			OffreTags foundedOffreTags = findByRef(offreTags.getRef());
	       if(foundedOffreTags!=null)
	          return null;  

	    OffreTags savedOffreTags = offreTagsDao.save(offreTags);
	   return savedOffreTags;
	}

    @Override
    public List<OffreTags> save(List<OffreTags> offreTagss){
		List<OffreTags> list = new ArrayList<OffreTags>();
		for(OffreTags offreTags: offreTagss){
		        list.add(save(offreTags));	
		}
		return list;
	}


   @Override
   public OffreTags update(OffreTags offreTags){
     
    
		  OffreTags foundedOffreTags = findById(offreTags.getId()); 
		       if(foundedOffreTags==null)
	          return null;	  
	  
	   return  offreTagsDao.save(offreTags);
     
     }
    
	@Override
	@Transactional
	public int delete(OffreTags offreTags){

	        if(offreTags.getRef()==null)
			  return -1;
		
			OffreTags foundedOffreTags = findByRef(offreTags.getRef());
	       if(foundedOffreTags==null)
	          return -1;  
	   offreTagsDao.delete(foundedOffreTags);
	   return 1;
	}


	public List<OffreTags> findByCriteria(OffreTagsVo offreTagsVo){
      String query = "SELECT o FROM OffreTags o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "ref","LIKE",offreTagsVo.getRef());

		 	 query += SearchUtil.addConstraint( "o", "id","=",offreTagsVo.getId());
			 query += SearchUtil.addConstraint( "o", "libellee","LIKE",offreTagsVo.getLibellee());

	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
