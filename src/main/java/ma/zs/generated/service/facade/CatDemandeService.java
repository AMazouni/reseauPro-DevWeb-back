package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.CatDemande;
import ma.zs.generated.ws.rest.provided.vo.CatDemandeVo;

public interface CatDemandeService {

        /**

     * find all CatDemande in database 
     * @return List<CatDemande> , If database is empty return  null.
     */
	List<CatDemande> findAll();
	   
	/**

     * find CatDemande from database by ref (reference)
     * @param ref - reference of CatDemande 
     * @return the founded CatDemande , If no CatDemande were
     *         found in database return  null.
     */
	CatDemande findByRef(String ref);

    /**
     * find CatDemande from database by id (id)
     * @param id - id of CatDemande 
     * @return the founded  CatDemande , If no CatDemande were
     *         found in database return  null.
     */
	CatDemande findById(Long id);
     
     /**
     * delete CatDemande from database
     * @param id - id of CatDemande to be deleted
     * 
     */
	void deleteById(Long id);

    /**
     * save CatDemande in database
     * @param catDemande - CatDemande to be saved 
     * @return the saved CatDemande, If the CatDemande can't be saved return null.
     */
	CatDemande save(CatDemande catDemande);

	/**
     * save list CatDemande in database
     * @param catDemandes - list of CatDemande to be saved 
     * @return the saved CatDemande list
     */
	List<CatDemande> save(List<CatDemande> catDemandes);
    
     /**
     * update CatDemande in database
     * @param catDemande - CatDemande to be updated
     * @return the updated CatDemande, If the CatDemande can't be updated return null.
     */
    CatDemande update(CatDemande catDemande);
    
       /**
     * delete CatDemande from database
     * @param catDemande - CatDemande to be deleted
     * @return 1 if CatDemande deleted successfully, If the CatDemande can't be deleted return negative int
     */
	int delete(CatDemande catDemande);


    
        /**
     * delete CatDemande from database by ref (reference)
     * 
     * @param ref - reference of CatDemande to be deleted
     * @return 1 if CatDemande deleted successfully
     */
	int deleteByRef(String ref);

     
	/**
     * search for CatDemande in by some criteria
     * @return the searhed list CatDemande 
     */
	List<CatDemande> findByCriteria( CatDemandeVo catDemandeVo);
}