package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Reponse;
import ma.zs.generated.ws.rest.provided.vo.ReponseVo;

public interface ReponseService {

        /**

     * find all Reponse in database 
     * @return List<Reponse> , If database is empty return  null.
     */
	List<Reponse> findAll();
	   
	/**

     * find Reponse from database by reponse (reference)
     * @param reponse - reference of Reponse 
     * @return the founded Reponse , If no Reponse were
     *         found in database return  null.
     */
	Reponse findByReponse(String reponse);

    /**
     * find Reponse from database by id (id)
     * @param id - id of Reponse 
     * @return the founded  Reponse , If no Reponse were
     *         found in database return  null.
     */
	Reponse findById(Long id);
     
     /**
     * delete Reponse from database
     * @param id - id of Reponse to be deleted
     * 
     */
	void deleteById(Long id);

	List<Reponse> findByQuestionFormule(String formule);
    int deleteByQuestionFormule(String formule);       
			
    List<Reponse> findByQuestionId(Long id);
    int deleteByQuestionId(Long id);
			 
    /**
     * save Reponse in database
     * @param reponse - Reponse to be saved 
     * @return the saved Reponse, If the Reponse can't be saved return null.
     */
	Reponse save(Reponse reponse);

	/**
     * save list Reponse in database
     * @param reponses - list of Reponse to be saved 
     * @return the saved Reponse list
     */
	List<Reponse> save(List<Reponse> reponses);
    
     /**
     * update Reponse in database
     * @param reponse - Reponse to be updated
     * @return the updated Reponse, If the Reponse can't be updated return null.
     */
    Reponse update(Reponse reponse);
    
       /**
     * delete Reponse from database
     * @param reponse - Reponse to be deleted
     * @return 1 if Reponse deleted successfully, If the Reponse can't be deleted return negative int
     */
	int delete(Reponse reponse);


    
        /**
     * delete Reponse from database by reponse (reference)
     * 
     * @param reponse - reference of Reponse to be deleted
     * @return 1 if Reponse deleted successfully
     */
	int deleteByReponse(String reponse);

     
	/**
     * search for Reponse in by some criteria
     * @return the searhed list Reponse 
     */
	List<Reponse> findByCriteria( ReponseVo reponseVo);
}