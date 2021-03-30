package ma.zs.generated.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import ma.zs.generated.bean.Question;
import ma.zs.generated.dao.QuestionDao;
import ma.zs.generated.service.facade.QuestionService;

import ma.zs.generated.ws.rest.provided.vo.QuestionVo;
import ma.zs.generated.service.util.*;
@Service
public class QuestionServiceImpl implements QuestionService {

   @Autowired
   private QuestionDao questionDao;
   

   @Autowired 
   private EntityManager entityManager; 

	@Override
	public List<Question> findAll(){
		return questionDao.findAll();
	}	
	@Override
	public Question findByFormule(String formule){
		if( formule==null)
		  return null;
		return questionDao.findByFormule(formule);
	}

   

	@Override
	@Transactional
	public int deleteByFormule(String  formule) {
		return questionDao.deleteByFormule(formule);	 
	}

	@Override
	public Question findById(Long id){
		 if(id==null)
		  return null;
		return questionDao.getOne(id);
	}
    
	@Transactional
   public void deleteById(Long id){
           questionDao.deleteById(id);
   }
	@Override	
	public Question save (Question question){
			Question foundedQuestion = findByFormule(question.getFormule());
	       if(foundedQuestion!=null)
	          return null;  

	    Question savedQuestion = questionDao.save(question);
	   return savedQuestion;
	}

    @Override
    public List<Question> save(List<Question> questions){
		List<Question> list = new ArrayList<Question>();
		for(Question question: questions){
		        list.add(save(question));	
		}
		return list;
	}


   @Override
   public Question update(Question question){
     
    
		  Question foundedQuestion = findById(question.getId()); 
		       if(foundedQuestion==null)
	          return null;	  
	  
	   return  questionDao.save(question);
     
     }
    
	@Override
	@Transactional
	public int delete(Question question){

	        if(question.getFormule()==null)
			  return -1;
		
			Question foundedQuestion = findByFormule(question.getFormule());
	       if(foundedQuestion==null)
	          return -1;  
	   questionDao.delete(foundedQuestion);
	   return 1;
	}


	public List<Question> findByCriteria(QuestionVo questionVo){
      String query = "SELECT o FROM Question o where 1=1 ";
			 query += SearchUtil.addConstraint( "o", "formule","LIKE",questionVo.getFormule());

			 query += SearchUtil.addConstraint( "o", "reponseCorrecte","LIKE",questionVo.getReponseCorrecte());

			 query += SearchUtil.addConstraint( "o", "ref","LIKE",questionVo.getRef());

		 	 query += SearchUtil.addConstraint( "o", "id","=",questionVo.getId());
	 return entityManager.createQuery(query).getResultList();
	}
	
 
}
