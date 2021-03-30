package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Offre;
import ma.zs.generated.ws.rest.provided.vo.OffreVo;

public interface OffreService {

        /**

     * find all Offre in database 
     * @return List<Offre> , If database is empty return  null.
     */
	List<Offre> findAll();
	   
	/**

     * find Offre from database by ref (reference)
     * @param ref - reference of Offre 
     * @return the founded Offre , If no Offre were
     *         found in database return  null.
     */
	Offre findByRef(String ref);

    /**
     * find Offre from database by id (id)
     * @param id - id of Offre 
     * @return the founded  Offre , If no Offre were
     *         found in database return  null.
     */
	Offre findById(Long id);
     
     /**
     * delete Offre from database
     * @param id - id of Offre to be deleted
     * 
     */
	void deleteById(Long id);

	List<Offre> findByTagsRef(String ref);
    int deleteByTagsRef(String ref);       
			
    List<Offre> findByTagsId(Long id);
    int deleteByTagsId(Long id);
			 
	List<Offre> findByFonctionRef(String ref);
    int deleteByFonctionRef(String ref);       
			
    List<Offre> findByFonctionId(Long id);
    int deleteByFonctionId(Long id);
			 
    /**
     * save Offre in database
     * @param offre - Offre to be saved 
     * @return the saved Offre, If the Offre can't be saved return null.
     */
	Offre save(Offre offre);

	/**
     * save list Offre in database
     * @param offres - list of Offre to be saved 
     * @return the saved Offre list
     */
	List<Offre> save(List<Offre> offres);
    
     /**
     * update Offre in database
     * @param offre - Offre to be updated
     * @return the updated Offre, If the Offre can't be updated return null.
     */
    Offre update(Offre offre);
    
       /**
     * delete Offre from database
     * @param offre - Offre to be deleted
     * @return 1 if Offre deleted successfully, If the Offre can't be deleted return negative int
     */
	int delete(Offre offre);


    
        /**
     * delete Offre from database by ref (reference)
     * 
     * @param ref - reference of Offre to be deleted
     * @return 1 if Offre deleted successfully
     */
	int deleteByRef(String ref);

     
	/**
     * search for Offre in by some criteria
     * @return the searhed list Offre 
     */
	List<Offre> findByCriteria( OffreVo offreVo);
}