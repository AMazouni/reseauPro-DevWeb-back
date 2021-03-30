package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Etablissement;
import ma.zs.generated.ws.rest.provided.vo.EtablissementVo;

public interface EtablissementService {

        /**

     * find all Etablissement in database 
     * @return List<Etablissement> , If database is empty return  null.
     */
	List<Etablissement> findAll();
	   
	/**

     * find Etablissement from database by ref (reference)
     * @param ref - reference of Etablissement 
     * @return the founded Etablissement , If no Etablissement were
     *         found in database return  null.
     */
	Etablissement findByRef(String ref);

    /**
     * find Etablissement from database by id (id)
     * @param id - id of Etablissement 
     * @return the founded  Etablissement , If no Etablissement were
     *         found in database return  null.
     */
	Etablissement findById(Long id);
     
     /**
     * delete Etablissement from database
     * @param id - id of Etablissement to be deleted
     * 
     */
	void deleteById(Long id);

    /**
     * save Etablissement in database
     * @param etablissement - Etablissement to be saved 
     * @return the saved Etablissement, If the Etablissement can't be saved return null.
     */
	Etablissement save(Etablissement etablissement);

	/**
     * save list Etablissement in database
     * @param etablissements - list of Etablissement to be saved 
     * @return the saved Etablissement list
     */
	List<Etablissement> save(List<Etablissement> etablissements);
    
     /**
     * update Etablissement in database
     * @param etablissement - Etablissement to be updated
     * @return the updated Etablissement, If the Etablissement can't be updated return null.
     */
    Etablissement update(Etablissement etablissement);
    
       /**
     * delete Etablissement from database
     * @param etablissement - Etablissement to be deleted
     * @return 1 if Etablissement deleted successfully, If the Etablissement can't be deleted return negative int
     */
	int delete(Etablissement etablissement);


    
        /**
     * delete Etablissement from database by ref (reference)
     * 
     * @param ref - reference of Etablissement to be deleted
     * @return 1 if Etablissement deleted successfully
     */
	int deleteByRef(String ref);

     
	/**
     * search for Etablissement in by some criteria
     * @return the searhed list Etablissement 
     */
	List<Etablissement> findByCriteria( EtablissementVo etablissementVo);
}