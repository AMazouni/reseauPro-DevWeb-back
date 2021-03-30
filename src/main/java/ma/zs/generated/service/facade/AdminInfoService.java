package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.AdminInfo;
import ma.zs.generated.ws.rest.provided.vo.AdminInfoVo;

public interface AdminInfoService {

        /**

     * find all AdminInfo in database 
     * @return List<AdminInfo> , If database is empty return  null.
     */
	List<AdminInfo> findAll();
	   
	/**

     * find AdminInfo from database by nom (reference)
     * @param nom - reference of AdminInfo 
     * @return the founded AdminInfo , If no AdminInfo were
     *         found in database return  null.
     */
	AdminInfo findByNom(String nom);

    /**
     * find AdminInfo from database by id (id)
     * @param id - id of AdminInfo 
     * @return the founded  AdminInfo , If no AdminInfo were
     *         found in database return  null.
     */
	AdminInfo findById(Long id);
     
     /**
     * delete AdminInfo from database
     * @param id - id of AdminInfo to be deleted
     * 
     */
	void deleteById(Long id);

	List<AdminInfo> findByCompteEmail(String email);
    int deleteByCompteEmail(String email);       
			
    List<AdminInfo> findByCompteId(Long id);
    int deleteByCompteId(Long id);
			 
    /**
     * save AdminInfo in database
     * @param adminInfo - AdminInfo to be saved 
     * @return the saved AdminInfo, If the AdminInfo can't be saved return null.
     */
	AdminInfo save(AdminInfo adminInfo);

	/**
     * save list AdminInfo in database
     * @param adminInfos - list of AdminInfo to be saved 
     * @return the saved AdminInfo list
     */
	List<AdminInfo> save(List<AdminInfo> adminInfos);
    
     /**
     * update AdminInfo in database
     * @param adminInfo - AdminInfo to be updated
     * @return the updated AdminInfo, If the AdminInfo can't be updated return null.
     */
    AdminInfo update(AdminInfo adminInfo);
    
       /**
     * delete AdminInfo from database
     * @param adminInfo - AdminInfo to be deleted
     * @return 1 if AdminInfo deleted successfully, If the AdminInfo can't be deleted return negative int
     */
	int delete(AdminInfo adminInfo);


    
        /**
     * delete AdminInfo from database by nom (reference)
     * 
     * @param nom - reference of AdminInfo to be deleted
     * @return 1 if AdminInfo deleted successfully
     */
	int deleteByNom(String nom);

     
	/**
     * search for AdminInfo in by some criteria
     * @return the searhed list AdminInfo 
     */
	List<AdminInfo> findByCriteria( AdminInfoVo adminInfoVo);
}