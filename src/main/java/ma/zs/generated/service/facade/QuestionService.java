package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Question;
import ma.zs.generated.ws.rest.provided.vo.QuestionVo;

public interface QuestionService {

        /**

     * find all Question in database 
     * @return List<Question> , If database is empty return  null.
     */
	List<Question> findAll();
	   
	/**

     * find Question from database by formule (reference)
     * @param formule - reference of Question 
     * @return the founded Question , If no Question were
     *         found in database return  null.
     */
	Question findByFormule(String formule);

    /**
     * find Question from database by id (id)
     * @param id - id of Question 
     * @return the founded  Question , If no Question were
     *         found in database return  null.
     */
	Question findById(Long id);
     
     /**
     * delete Question from database
     * @param id - id of Question to be deleted
     * 
     */
	void deleteById(Long id);

    /**
     * save Question in database
     * @param question - Question to be saved 
     * @return the saved Question, If the Question can't be saved return null.
     */
	Question save(Question question);

	/**
     * save list Question in database
     * @param questions - list of Question to be saved 
     * @return the saved Question list
     */
	List<Question> save(List<Question> questions);
    
     /**
     * update Question in database
     * @param question - Question to be updated
     * @return the updated Question, If the Question can't be updated return null.
     */
    Question update(Question question);
    
       /**
     * delete Question from database
     * @param question - Question to be deleted
     * @return 1 if Question deleted successfully, If the Question can't be deleted return negative int
     */
	int delete(Question question);


    
        /**
     * delete Question from database by formule (reference)
     * 
     * @param formule - reference of Question to be deleted
     * @return 1 if Question deleted successfully
     */
	int deleteByFormule(String formule);

     
	/**
     * search for Question in by some criteria
     * @return the searhed list Question 
     */
	List<Question> findByCriteria( QuestionVo questionVo);
}