package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Status;
import ma.zs.generated.dao.StatusDao;
import ma.zs.generated.service.facade.StatusService;

import ma.zs.generated.ws.rest.provided.vo.StatusVo;
import ma.zs.generated.service.util.*;
@Service
public class StatusServiceImpl implements StatusService {

   @Autowired
   private StatusDao statusDao;
   

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Status> findAll(){
		return statusDao.findAll();
	}	
	@Override
	public Status findByCode(String code){
		if( code==null)
		  return null;
		return statusDao.findByCode(code);
	}

   

	@Override
	@Transactional
	public int deleteByCode(String  code) {
		return statusDao.deleteByCode(code);	 
	}

	@Override
	public Status findById(Long id){
		 if(id==null)
		  return null;
		return statusDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           statusDao.deleteById(id);
   }
	@Override	
	public Status save (Status status){
			Status foundedStatus = findByCode(status.getCode());
	       if(foundedStatus!=null)
	          return null;  

	    Status savedStatus = statusDao.save(status);
	   return savedStatus;
	}

    @Override
    public List<Status> save(List<Status> statuss){
		List<Status> list = new ArrayList<Status>();
		for(Status status: statuss){
		        list.add(save(status));	
		}
		return list;
	}


   @Override
   public Status update(Status status){
     
    
		  Status foundedStatus = findById(status.getId()); 
		       if(foundedStatus==null)
	          return null;	  
	  
	   return  statusDao.save(status);
     
     }
    
	@Override
	@Transactional
	public int delete(Status status){

	        if(status.getCode()==null)
			  return -1;
		
			Status foundedStatus = findByCode(status.getCode());
	       if(foundedStatus==null)
	          return -1;  
	   statusDao.delete(foundedStatus);
	   return 1;
	}


	public List<Status> findByCriteria(StatusVo statusVo){
      String query = "SELECT o FROM Status o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "code","LIKE",statusVo.getCode());

			 query += SearchUtil.addConstraint( "o", "libelle","LIKE",statusVo.getLibelle());

			 query += SearchUtil.addConstraint( "o", "ref","LIKE",statusVo.getRef());

		 	 query += SearchUtil.addConstraint( "o", "id","=",statusVo.getId());
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
