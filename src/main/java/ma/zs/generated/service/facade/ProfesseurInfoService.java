package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.ProfesseurInfo;
import ma.zs.generated.ws.rest.provided.vo.ProfesseurInfoVo;

public interface ProfesseurInfoService {

        /**

     * find all ProfesseurInfo in database 
     * @return List<ProfesseurInfo> , If database is empty return  null.
     */
	List<ProfesseurInfo> findAll();
	   
	/**

     * find ProfesseurInfo from database by code (reference)
     * @param code - reference of ProfesseurInfo 
     * @return the founded ProfesseurInfo , If no ProfesseurInfo were
     *         found in database return  null.
     */
	ProfesseurInfo findByCode(String code);

    /**
     * find ProfesseurInfo from database by id (id)
     * @param id - id of ProfesseurInfo 
     * @return the founded  ProfesseurInfo , If no ProfesseurInfo were
     *         found in database return  null.
     */
	ProfesseurInfo findById(Long id);
     
     /**
     * delete ProfesseurInfo from database
     * @param id - id of ProfesseurInfo to be deleted
     * 
     */
	void deleteById(Long id);

	List<ProfesseurInfo> findByEtablissementRef(String ref);
    int deleteByEtablissementRef(String ref);       
			
    List<ProfesseurInfo> findByEtablissementId(Long id);
    int deleteByEtablissementId(Long id);
			 
	List<ProfesseurInfo> findByCompteEmail(String email);
    int deleteByCompteEmail(String email);       
			
    List<ProfesseurInfo> findByCompteId(Long id);
    int deleteByCompteId(Long id);
			 
    /**
     * save ProfesseurInfo in database
     * @param professeurInfo - ProfesseurInfo to be saved 
     * @return the saved ProfesseurInfo, If the ProfesseurInfo can't be saved return null.
     */
	ProfesseurInfo save(ProfesseurInfo professeurInfo);

	/**
     * save list ProfesseurInfo in database
     * @param professeurInfos - list of ProfesseurInfo to be saved 
     * @return the saved ProfesseurInfo list
     */
	List<ProfesseurInfo> save(List<ProfesseurInfo> professeurInfos);
    
     /**
     * update ProfesseurInfo in database
     * @param professeurInfo - ProfesseurInfo to be updated
     * @return the updated ProfesseurInfo, If the ProfesseurInfo can't be updated return null.
     */
    ProfesseurInfo update(ProfesseurInfo professeurInfo);
    
       /**
     * delete ProfesseurInfo from database
     * @param professeurInfo - ProfesseurInfo to be deleted
     * @return 1 if ProfesseurInfo deleted successfully, If the ProfesseurInfo can't be deleted return negative int
     */
	int delete(ProfesseurInfo professeurInfo);


    
        /**
     * delete ProfesseurInfo from database by code (reference)
     * 
     * @param code - reference of ProfesseurInfo to be deleted
     * @return 1 if ProfesseurInfo deleted successfully
     */
	int deleteByCode(String code);

     
	/**
     * search for ProfesseurInfo in by some criteria
     * @return the searhed list ProfesseurInfo 
     */
	List<ProfesseurInfo> findByCriteria( ProfesseurInfoVo professeurInfoVo);
}