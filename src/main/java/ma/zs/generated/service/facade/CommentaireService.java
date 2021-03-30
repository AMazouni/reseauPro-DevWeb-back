package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Commentaire;
import ma.zs.generated.ws.rest.provided.vo.CommentaireVo;

public interface CommentaireService {

        /**

     * find all Commentaire in database 
     * @return List<Commentaire> , If database is empty return  null.
     */
	List<Commentaire> findAll();
	   
	/**

     * find Commentaire from database by comref (reference)
     * @param comref - reference of Commentaire 
     * @return the founded Commentaire , If no Commentaire were
     *         found in database return  null.
     */
	Commentaire findByComref(String comref);

    /**
     * find Commentaire from database by id (id)
     * @param id - id of Commentaire 
     * @return the founded  Commentaire , If no Commentaire were
     *         found in database return  null.
     */
	Commentaire findById(Long id);
     
     /**
     * delete Commentaire from database
     * @param id - id of Commentaire to be deleted
     * 
     */
	void deleteById(Long id);

	List<Commentaire> findByPublicationRef(String ref);
    int deleteByPublicationRef(String ref);       
			
    List<Commentaire> findByPublicationId(Long id);
    int deleteByPublicationId(Long id);
			 
	List<Commentaire> findByPosteParEmail(String email);
    int deleteByPosteParEmail(String email);       
			
    List<Commentaire> findByPosteParId(Long id);
    int deleteByPosteParId(Long id);
			 
    /**
     * save Commentaire in database
     * @param commentaire - Commentaire to be saved 
     * @return the saved Commentaire, If the Commentaire can't be saved return null.
     */
	Commentaire save(Commentaire commentaire);

	/**
     * save list Commentaire in database
     * @param commentaires - list of Commentaire to be saved 
     * @return the saved Commentaire list
     */
	List<Commentaire> save(List<Commentaire> commentaires);
    
     /**
     * update Commentaire in database
     * @param commentaire - Commentaire to be updated
     * @return the updated Commentaire, If the Commentaire can't be updated return null.
     */
    Commentaire update(Commentaire commentaire);
    
       /**
     * delete Commentaire from database
     * @param commentaire - Commentaire to be deleted
     * @return 1 if Commentaire deleted successfully, If the Commentaire can't be deleted return negative int
     */
	int delete(Commentaire commentaire);


    
        /**
     * delete Commentaire from database by comref (reference)
     * 
     * @param comref - reference of Commentaire to be deleted
     * @return 1 if Commentaire deleted successfully
     */
	int deleteByComref(String comref);

     
	/**
     * search for Commentaire in by some criteria
     * @return the searhed list Commentaire 
     */
	List<Commentaire> findByCriteria( CommentaireVo commentaireVo);
}