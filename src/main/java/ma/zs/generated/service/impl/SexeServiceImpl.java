package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Sexe;
import ma.zs.generated.dao.SexeDao;
import ma.zs.generated.service.facade.SexeService;

import ma.zs.generated.ws.rest.provided.vo.SexeVo;
import ma.zs.generated.service.util.*;
@Service
public class SexeServiceImpl implements SexeService {

   @Autowired
   private SexeDao sexeDao;
   

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Sexe> findAll(){
		return sexeDao.findAll();
	}	
	@Override
	public Sexe findByRef(String ref){
		if( ref==null)
		  return null;
		return sexeDao.findByRef(ref);
	}

   

	@Override
	@Transactional
	public int deleteByRef(String  ref) {
		return sexeDao.deleteByRef(ref);	 
	}

	@Override
	public Sexe findById(Long id){
		 if(id==null)
		  return null;
		return sexeDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           sexeDao.deleteById(id);
   }
	@Override	
	public Sexe save (Sexe sexe){
			Sexe foundedSexe = findByRef(sexe.getRef());
	       if(foundedSexe!=null)
	          return null;  

	    Sexe savedSexe = sexeDao.save(sexe);
	   return savedSexe;
	}

    @Override
    public List<Sexe> save(List<Sexe> sexes){
		List<Sexe> list = new ArrayList<Sexe>();
		for(Sexe sexe: sexes){
		        list.add(save(sexe));	
		}
		return list;
	}


   @Override
   public Sexe update(Sexe sexe){
     
    
		  Sexe foundedSexe = findById(sexe.getId()); 
		       if(foundedSexe==null)
	          return null;	  
	  
	   return  sexeDao.save(sexe);
     
     }
    
	@Override
	@Transactional
	public int delete(Sexe sexe){

	        if(sexe.getRef()==null)
			  return -1;
		
			Sexe foundedSexe = findByRef(sexe.getRef());
	       if(foundedSexe==null)
	          return -1;  
	   sexeDao.delete(foundedSexe);
	   return 1;
	}


	public List<Sexe> findByCriteria(SexeVo sexeVo){
      String query = "SELECT o FROM Sexe o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "libelle","LIKE",sexeVo.getLibelle());

			 query += SearchUtil.addConstraint( "o", "icon","LIKE",sexeVo.getIcon());

			 query += SearchUtil.addConstraint( "o", "ref","LIKE",sexeVo.getRef());

		 	 query += SearchUtil.addConstraint( "o", "id","=",sexeVo.getId());
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
