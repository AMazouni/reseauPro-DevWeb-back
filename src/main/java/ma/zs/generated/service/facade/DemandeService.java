package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Demande;
import ma.zs.generated.ws.rest.provided.vo.DemandeVo;

public interface DemandeService {

        /**

     * find all Demande in database 
     * @return List<Demande> , If database is empty return  null.
     */
	List<Demande> findAll();
	   
	/**

     * find Demande from database by ref (reference)
     * @param ref - reference of Demande 
     * @return the founded Demande , If no Demande were
     *         found in database return  null.
     */
	Demande findByRef(String ref);

    /**
     * find Demande from database by id (id)
     * @param id - id of Demande 
     * @return the founded  Demande , If no Demande were
     *         found in database return  null.
     */
	Demande findById(Long id);
     
     /**
     * delete Demande from database
     * @param id - id of Demande to be deleted
     * 
     */
	void deleteById(Long id);

	List<Demande> findByCategorieDemandeRef(String ref);
    int deleteByCategorieDemandeRef(String ref);       
			
    List<Demande> findByCategorieDemandeId(Long id);
    int deleteByCategorieDemandeId(Long id);
			 
	List<Demande> findByDemandeParCne(String cne);
    int deleteByDemandeParCne(String cne);       
			
    List<Demande> findByDemandeParId(Long id);
    int deleteByDemandeParId(Long id);
			 
	List<Demande> findByStatusCode(String code);
    int deleteByStatusCode(String code);       
			
    List<Demande> findByStatusId(Long id);
    int deleteByStatusId(Long id);
			 
	List<Demande> findByDemandeACne(String cne);
    int deleteByDemandeACne(String cne);       
			
    List<Demande> findByDemandeAId(Long id);
    int deleteByDemandeAId(Long id);
			 
    /**
     * save Demande in database
     * @param demande - Demande to be saved 
     * @return the saved Demande, If the Demande can't be saved return null.
     */
	Demande save(Demande demande);

	/**
     * save list Demande in database
     * @param demandes - list of Demande to be saved 
     * @return the saved Demande list
     */
	List<Demande> save(List<Demande> demandes);
    
     /**
     * update Demande in database
     * @param demande - Demande to be updated
     * @return the updated Demande, If the Demande can't be updated return null.
     */
    Demande update(Demande demande);
    
       /**
     * delete Demande from database
     * @param demande - Demande to be deleted
     * @return 1 if Demande deleted successfully, If the Demande can't be deleted return negative int
     */
	int delete(Demande demande);


    
        /**
     * delete Demande from database by ref (reference)
     * 
     * @param ref - reference of Demande to be deleted
     * @return 1 if Demande deleted successfully
     */
	int deleteByRef(String ref);

     
	/**
     * search for Demande in by some criteria
     * @return the searhed list Demande 
     */
	List<Demande> findByCriteria( DemandeVo demandeVo);
}