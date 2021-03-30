package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Candidature;
import ma.zs.generated.ws.rest.provided.vo.CandidatureVo;

public interface CandidatureService {

        /**

     * find all Candidature in database 
     * @return List<Candidature> , If database is empty return  null.
     */
	List<Candidature> findAll();
	   
	/**

     * find Candidature from database by ref (reference)
     * @param ref - reference of Candidature 
     * @return the founded Candidature , If no Candidature were
     *         found in database return  null.
     */
	Candidature findByRef(String ref);

    /**
     * find Candidature from database by id (id)
     * @param id - id of Candidature 
     * @return the founded  Candidature , If no Candidature were
     *         found in database return  null.
     */
	Candidature findById(Long id);
     
     /**
     * delete Candidature from database
     * @param id - id of Candidature to be deleted
     * 
     */
	void deleteById(Long id);

	List<Candidature> findByCandidatCne(String cne);
    int deleteByCandidatCne(String cne);       
			
    List<Candidature> findByCandidatId(Long id);
    int deleteByCandidatId(Long id);
			 
	List<Candidature> findByStatusCode(String code);
    int deleteByStatusCode(String code);       
			
    List<Candidature> findByStatusId(Long id);
    int deleteByStatusId(Long id);
			 
	List<Candidature> findByOffreConcerneRef(String ref);
    int deleteByOffreConcerneRef(String ref);       
			
    List<Candidature> findByOffreConcerneId(Long id);
    int deleteByOffreConcerneId(Long id);
			 
    /**
     * save Candidature in database
     * @param candidature - Candidature to be saved 
     * @return the saved Candidature, If the Candidature can't be saved return null.
     */
	Candidature save(Candidature candidature);

	/**
     * save list Candidature in database
     * @param candidatures - list of Candidature to be saved 
     * @return the saved Candidature list
     */
	List<Candidature> save(List<Candidature> candidatures);
    
     /**
     * update Candidature in database
     * @param candidature - Candidature to be updated
     * @return the updated Candidature, If the Candidature can't be updated return null.
     */
    Candidature update(Candidature candidature);
    
       /**
     * delete Candidature from database
     * @param candidature - Candidature to be deleted
     * @return 1 if Candidature deleted successfully, If the Candidature can't be deleted return negative int
     */
	int delete(Candidature candidature);


    
        /**
     * delete Candidature from database by ref (reference)
     * 
     * @param ref - reference of Candidature to be deleted
     * @return 1 if Candidature deleted successfully
     */
	int deleteByRef(String ref);

     
	/**
     * search for Candidature in by some criteria
     * @return the searhed list Candidature 
     */
	List<Candidature> findByCriteria( CandidatureVo candidatureVo);
}