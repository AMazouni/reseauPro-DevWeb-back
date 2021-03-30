package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Entreprise;
import ma.zs.generated.ws.rest.provided.vo.EntrepriseVo;

public interface EntrepriseService {

        /**

     * find all Entreprise in database 
     * @return List<Entreprise> , If database is empty return  null.
     */
	List<Entreprise> findAll();
	   
	/**

     * find Entreprise from database by ref (reference)
     * @param ref - reference of Entreprise 
     * @return the founded Entreprise , If no Entreprise were
     *         found in database return  null.
     */
	Entreprise findByRef(String ref);

    /**
     * find Entreprise from database by id (id)
     * @param id - id of Entreprise 
     * @return the founded  Entreprise , If no Entreprise were
     *         found in database return  null.
     */
	Entreprise findById(Long id);
     
     /**
     * delete Entreprise from database
     * @param id - id of Entreprise to be deleted
     * 
     */
	void deleteById(Long id);

    /**
     * save Entreprise in database
     * @param entreprise - Entreprise to be saved 
     * @return the saved Entreprise, If the Entreprise can't be saved return null.
     */
	Entreprise save(Entreprise entreprise);

	/**
     * save list Entreprise in database
     * @param entreprises - list of Entreprise to be saved 
     * @return the saved Entreprise list
     */
	List<Entreprise> save(List<Entreprise> entreprises);
    
     /**
     * update Entreprise in database
     * @param entreprise - Entreprise to be updated
     * @return the updated Entreprise, If the Entreprise can't be updated return null.
     */
    Entreprise update(Entreprise entreprise);
    
       /**
     * delete Entreprise from database
     * @param entreprise - Entreprise to be deleted
     * @return 1 if Entreprise deleted successfully, If the Entreprise can't be deleted return negative int
     */
	int delete(Entreprise entreprise);


    
        /**
     * delete Entreprise from database by ref (reference)
     * 
     * @param ref - reference of Entreprise to be deleted
     * @return 1 if Entreprise deleted successfully
     */
	int deleteByRef(String ref);

     
	/**
     * search for Entreprise in by some criteria
     * @return the searhed list Entreprise 
     */
	List<Entreprise> findByCriteria( EntrepriseVo entrepriseVo);
}