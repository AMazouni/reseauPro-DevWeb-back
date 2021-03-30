package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Publication;
import ma.zs.generated.ws.rest.provided.vo.PublicationVo;

public interface PublicationService {

        /**

     * find all Publication in database 
     * @return List<Publication> , If database is empty return  null.
     */
	List<Publication> findAll();
	   
	/**

     * find Publication from database by ref (reference)
     * @param ref - reference of Publication 
     * @return the founded Publication , If no Publication were
     *         found in database return  null.
     */
	Publication findByRef(String ref);

    /**
     * find Publication from database by id (id)
     * @param id - id of Publication 
     * @return the founded  Publication , If no Publication were
     *         found in database return  null.
     */
	Publication findById(Long id);
     
     /**
     * delete Publication from database
     * @param id - id of Publication to be deleted
     * 
     */
	void deleteById(Long id);

	List<Publication> findByPosteParEmail(String email);
    int deleteByPosteParEmail(String email);       
			
    List<Publication> findByPosteParId(Long id);
    int deleteByPosteParId(Long id);
			 
    /**
     * save Publication in database
     * @param publication - Publication to be saved 
     * @return the saved Publication, If the Publication can't be saved return null.
     */
	Publication save(Publication publication);

	/**
     * save list Publication in database
     * @param publications - list of Publication to be saved 
     * @return the saved Publication list
     */
	List<Publication> save(List<Publication> publications);
    
     /**
     * update Publication in database
     * @param publication - Publication to be updated
     * @return the updated Publication, If the Publication can't be updated return null.
     */
    Publication update(Publication publication);
    
       /**
     * delete Publication from database
     * @param publication - Publication to be deleted
     * @return 1 if Publication deleted successfully, If the Publication can't be deleted return negative int
     */
	int delete(Publication publication);


    
        /**
     * delete Publication from database by ref (reference)
     * 
     * @param ref - reference of Publication to be deleted
     * @return 1 if Publication deleted successfully
     */
	int deleteByRef(String ref);

     
	/**
     * search for Publication in by some criteria
     * @return the searhed list Publication 
     */
	List<Publication> findByCriteria( PublicationVo publicationVo);
}