package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Status;
import ma.zs.generated.ws.rest.provided.vo.StatusVo;

public interface StatusService {

        /**

     * find all Status in database 
     * @return List<Status> , If database is empty return  null.
     */
	List<Status> findAll();
	   
	/**

     * find Status from database by code (reference)
     * @param code - reference of Status 
     * @return the founded Status , If no Status were
     *         found in database return  null.
     */
	Status findByCode(String code);

    /**
     * find Status from database by id (id)
     * @param id - id of Status 
     * @return the founded  Status , If no Status were
     *         found in database return  null.
     */
	Status findById(Long id);
     
     /**
     * delete Status from database
     * @param id - id of Status to be deleted
     * 
     */
	void deleteById(Long id);

    /**
     * save Status in database
     * @param status - Status to be saved 
     * @return the saved Status, If the Status can't be saved return null.
     */
	Status save(Status status);

	/**
     * save list Status in database
     * @param statuss - list of Status to be saved 
     * @return the saved Status list
     */
	List<Status> save(List<Status> statuss);
    
     /**
     * update Status in database
     * @param status - Status to be updated
     * @return the updated Status, If the Status can't be updated return null.
     */
    Status update(Status status);
    
       /**
     * delete Status from database
     * @param status - Status to be deleted
     * @return 1 if Status deleted successfully, If the Status can't be deleted return negative int
     */
	int delete(Status status);


    
        /**
     * delete Status from database by code (reference)
     * 
     * @param code - reference of Status to be deleted
     * @return 1 if Status deleted successfully
     */
	int deleteByCode(String code);

     
	/**
     * search for Status in by some criteria
     * @return the searhed list Status 
     */
	List<Status> findByCriteria( StatusVo statusVo);
}