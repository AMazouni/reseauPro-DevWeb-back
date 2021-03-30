package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Reponse;
import ma.zs.generated.bean.Question;
import ma.zs.generated.dao.ReponseDao;
import ma.zs.generated.service.facade.ReponseService;
import ma.zs.generated.service.facade.QuestionService;   

import ma.zs.generated.ws.rest.provided.vo.ReponseVo;
import ma.zs.generated.service.util.*;
@Service
public class ReponseServiceImpl implements ReponseService {

   @Autowired
   private ReponseDao reponseDao;
   
    @Autowired
    private QuestionService questionService ;

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Reponse> findAll(){
		return reponseDao.findAll();
	}	
	@Override
	public List<Reponse> findByQuestionFormule(String formule){
		return reponseDao.findByQuestionFormule(formule);
	}
	@Override
	@Transactional
    public int deleteByQuestionFormule(String formule){
		return reponseDao.deleteByQuestionFormule(formule);
	}
	
     @Override
    public List<Reponse> findByQuestionId(Long id){
		return reponseDao.findByQuestionId(id);

	}
	   @Override
	   @Transactional
    public int deleteByQuestionId(Long id){
		return reponseDao.deleteByQuestionId(id);

	}
     		
	@Override
	public Reponse findByReponse(String reponse){
		if( reponse==null)
		  return null;
		return reponseDao.findByReponse(reponse);
	}

   

	@Override
	@Transactional
	public int deleteByReponse(String  reponse) {
		return reponseDao.deleteByReponse(reponse);	 
	}

	@Override
	public Reponse findById(Long id){
		 if(id==null)
		  return null;
		return reponseDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           reponseDao.deleteById(id);
   }
	@Override	
	public Reponse save (Reponse reponse){
			Reponse foundedReponse = findByReponse(reponse.getReponse());
	       if(foundedReponse!=null)
	          return null;  
	    
	          if(reponse.getQuestion()!=null){
				    Question question = questionService.findByFormule(reponse.getQuestion().getFormule());
				  if(question == null)
				  reponse.setQuestion(questionService.save(reponse.getQuestion()));
				  else
				  reponse.setQuestion(question);
			  }

	    Reponse savedReponse = reponseDao.save(reponse);
	   return savedReponse;
	}

    @Override
    public List<Reponse> save(List<Reponse> reponses){
		List<Reponse> list = new ArrayList<Reponse>();
		for(Reponse reponse: reponses){
		        list.add(save(reponse));	
		}
		return list;
	}


   @Override
   public Reponse update(Reponse reponse){
     
    
		  Reponse foundedReponse = findById(reponse.getId()); 
		       if(foundedReponse==null)
	          return null;	  
	  
	   return  reponseDao.save(reponse);
     
     }
    
	@Override
	@Transactional
	public int delete(Reponse reponse){

	        if(reponse.getReponse()==null)
			  return -1;
		
			Reponse foundedReponse = findByReponse(reponse.getReponse());
	       if(foundedReponse==null)
	          return -1;  
	   reponseDao.delete(foundedReponse);
	   return 1;
	}


	public List<Reponse> findByCriteria(ReponseVo reponseVo){
      String query = "SELECT o FROM Reponse o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "reponse","LIKE",reponseVo.getReponse());

			 query += SearchUtil.addConstraint( "o", "ref","LIKE",reponseVo.getRef());

		 	 query += SearchUtil.addConstraint( "o", "id","=",reponseVo.getId());
   if(reponseVo.getQuestionVo()!=null){
     query += SearchUtil.addConstraint( "o", "question.id","=",reponseVo.getQuestionVo().getId());
     query += SearchUtil.addConstraint( "o", "question.formule","LIKE",reponseVo.getQuestionVo().getFormule());
   }
   
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
