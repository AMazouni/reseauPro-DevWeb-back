package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Sexe;
import ma.zs.generated.ws.rest.provided.vo.SexeVo;

public interface SexeService {

        /**

     * find all Sexe in database 
     * @return List<Sexe> , If database is empty return  null.
     */
	List<Sexe> findAll();
	   
	/**

     * find Sexe from database by ref (reference)
     * @param ref - reference of Sexe 
     * @return the founded Sexe , If no Sexe were
     *         found in database return  null.
     */
	Sexe findByRef(String ref);

    /**
     * find Sexe from database by id (id)
     * @param id - id of Sexe 
     * @return the founded  Sexe , If no Sexe were
     *         found in database return  null.
     */
	Sexe findById(Long id);
     
     /**
     * delete Sexe from database
     * @param id - id of Sexe to be deleted
     * 
     */
	void deleteById(Long id);

    /**
     * save Sexe in database
     * @param sexe - Sexe to be saved 
     * @return the saved Sexe, If the Sexe can't be saved return null.
     */
	Sexe save(Sexe sexe);

	/**
     * save list Sexe in database
     * @param sexes - list of Sexe to be saved 
     * @return the saved Sexe list
     */
	List<Sexe> save(List<Sexe> sexes);
    
     /**
     * update Sexe in database
     * @param sexe - Sexe to be updated
     * @return the updated Sexe, If the Sexe can't be updated return null.
     */
    Sexe update(Sexe sexe);
    
       /**
     * delete Sexe from database
     * @param sexe - Sexe to be deleted
     * @return 1 if Sexe deleted successfully, If the Sexe can't be deleted return negative int
     */
	int delete(Sexe sexe);


    
        /**
     * delete Sexe from database by ref (reference)
     * 
     * @param ref - reference of Sexe to be deleted
     * @return 1 if Sexe deleted successfully
     */
	int deleteByRef(String ref);

     
	/**
     * search for Sexe in by some criteria
     * @return the searhed list Sexe 
     */
	List<Sexe> findByCriteria( SexeVo sexeVo);
}