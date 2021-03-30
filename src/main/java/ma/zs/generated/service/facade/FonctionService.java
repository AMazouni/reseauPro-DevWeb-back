package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Fonction;
import ma.zs.generated.ws.rest.provided.vo.FonctionVo;

public interface FonctionService {

        /**

     * find all Fonction in database 
     * @return List<Fonction> , If database is empty return  null.
     */
	List<Fonction> findAll();
	   
	/**

     * find Fonction from database by ref (reference)
     * @param ref - reference of Fonction 
     * @return the founded Fonction , If no Fonction were
     *         found in database return  null.
     */
	Fonction findByRef(String ref);

    /**
     * find Fonction from database by id (id)
     * @param id - id of Fonction 
     * @return the founded  Fonction , If no Fonction were
     *         found in database return  null.
     */
	Fonction findById(Long id);
     
     /**
     * delete Fonction from database
     * @param id - id of Fonction to be deleted
     * 
     */
	void deleteById(Long id);

	List<Fonction> findByEntrepriseRef(String ref);
    int deleteByEntrepriseRef(String ref);       
			
    List<Fonction> findByEntrepriseId(Long id);
    int deleteByEntrepriseId(Long id);
			 
	List<Fonction> findByOccupeParCne(String cne);
    int deleteByOccupeParCne(String cne);       
			
    List<Fonction> findByOccupeParId(Long id);
    int deleteByOccupeParId(Long id);
			 
    /**
     * save Fonction in database
     * @param fonction - Fonction to be saved 
     * @return the saved Fonction, If the Fonction can't be saved return null.
     */
	Fonction save(Fonction fonction);

	/**
     * save list Fonction in database
     * @param fonctions - list of Fonction to be saved 
     * @return the saved Fonction list
     */
	List<Fonction> save(List<Fonction> fonctions);
    
     /**
     * update Fonction in database
     * @param fonction - Fonction to be updated
     * @return the updated Fonction, If the Fonction can't be updated return null.
     */
    Fonction update(Fonction fonction);
    
       /**
     * delete Fonction from database
     * @param fonction - Fonction to be deleted
     * @return 1 if Fonction deleted successfully, If the Fonction can't be deleted return negative int
     */
	int delete(Fonction fonction);


    
        /**
     * delete Fonction from database by ref (reference)
     * 
     * @param ref - reference of Fonction to be deleted
     * @return 1 if Fonction deleted successfully
     */
	int deleteByRef(String ref);

     
	/**
     * search for Fonction in by some criteria
     * @return the searhed list Fonction 
     */
	List<Fonction> findByCriteria( FonctionVo fonctionVo);
}