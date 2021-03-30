package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Formation;
import ma.zs.generated.ws.rest.provided.vo.FormationVo;

public interface FormationService {

        /**

     * find all Formation in database 
     * @return List<Formation> , If database is empty return  null.
     */
	List<Formation> findAll();
	   
	/**

     * find Formation from database by ref (reference)
     * @param ref - reference of Formation 
     * @return the founded Formation , If no Formation were
     *         found in database return  null.
     */
	Formation findByRef(String ref);

    /**
     * find Formation from database by id (id)
     * @param id - id of Formation 
     * @return the founded  Formation , If no Formation were
     *         found in database return  null.
     */
	Formation findById(Long id);
     
     /**
     * delete Formation from database
     * @param id - id of Formation to be deleted
     * 
     */
	void deleteById(Long id);

	List<Formation> findByEtablissementRef(String ref);
    int deleteByEtablissementRef(String ref);       
			
    List<Formation> findByEtablissementId(Long id);
    int deleteByEtablissementId(Long id);
			 
	List<Formation> findByResponsableCode(String code);
    int deleteByResponsableCode(String code);       
			
    List<Formation> findByResponsableId(Long id);
    int deleteByResponsableId(Long id);
			 
    /**
     * save Formation in database
     * @param formation - Formation to be saved 
     * @return the saved Formation, If the Formation can't be saved return null.
     */
	Formation save(Formation formation);

	/**
     * save list Formation in database
     * @param formations - list of Formation to be saved 
     * @return the saved Formation list
     */
	List<Formation> save(List<Formation> formations);
    
     /**
     * update Formation in database
     * @param formation - Formation to be updated
     * @return the updated Formation, If the Formation can't be updated return null.
     */
    Formation update(Formation formation);
    
       /**
     * delete Formation from database
     * @param formation - Formation to be deleted
     * @return 1 if Formation deleted successfully, If the Formation can't be deleted return negative int
     */
	int delete(Formation formation);


    
        /**
     * delete Formation from database by ref (reference)
     * 
     * @param ref - reference of Formation to be deleted
     * @return 1 if Formation deleted successfully
     */
	int deleteByRef(String ref);

     
	/**
     * search for Formation in by some criteria
     * @return the searhed list Formation 
     */
	List<Formation> findByCriteria( FormationVo formationVo);
}