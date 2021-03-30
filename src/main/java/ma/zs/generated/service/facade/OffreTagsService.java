package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.OffreTags;
import ma.zs.generated.ws.rest.provided.vo.OffreTagsVo;

public interface OffreTagsService {

        /**

     * find all OffreTags in database 
     * @return List<OffreTags> , If database is empty return  null.
     */
	List<OffreTags> findAll();
	   
	/**

     * find OffreTags from database by ref (reference)
     * @param ref - reference of OffreTags 
     * @return the founded OffreTags , If no OffreTags were
     *         found in database return  null.
     */
	OffreTags findByRef(String ref);

    /**
     * find OffreTags from database by id (id)
     * @param id - id of OffreTags 
     * @return the founded  OffreTags , If no OffreTags were
     *         found in database return  null.
     */
	OffreTags findById(Long id);
     
     /**
     * delete OffreTags from database
     * @param id - id of OffreTags to be deleted
     * 
     */
	void deleteById(Long id);

    /**
     * save OffreTags in database
     * @param offreTags - OffreTags to be saved 
     * @return the saved OffreTags, If the OffreTags can't be saved return null.
     */
	OffreTags save(OffreTags offreTags);

	/**
     * save list OffreTags in database
     * @param offreTagss - list of OffreTags to be saved 
     * @return the saved OffreTags list
     */
	List<OffreTags> save(List<OffreTags> offreTagss);
    
     /**
     * update OffreTags in database
     * @param offreTags - OffreTags to be updated
     * @return the updated OffreTags, If the OffreTags can't be updated return null.
     */
    OffreTags update(OffreTags offreTags);
    
       /**
     * delete OffreTags from database
     * @param offreTags - OffreTags to be deleted
     * @return 1 if OffreTags deleted successfully, If the OffreTags can't be deleted return negative int
     */
	int delete(OffreTags offreTags);


    
        /**
     * delete OffreTags from database by ref (reference)
     * 
     * @param ref - reference of OffreTags to be deleted
     * @return 1 if OffreTags deleted successfully
     */
	int deleteByRef(String ref);

     
	/**
     * search for OffreTags in by some criteria
     * @return the searhed list OffreTags 
     */
	List<OffreTags> findByCriteria( OffreTagsVo offreTagsVo);
}