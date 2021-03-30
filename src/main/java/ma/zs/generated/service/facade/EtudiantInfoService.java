package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.EtudiantInfo;
import ma.zs.generated.ws.rest.provided.vo.EtudiantInfoVo;

public interface EtudiantInfoService {

        /**

     * find all EtudiantInfo in database 
     * @return List<EtudiantInfo> , If database is empty return  null.
     */
	List<EtudiantInfo> findAll();
	   
	/**

     * find EtudiantInfo from database by cne (reference)
     * @param cne - reference of EtudiantInfo 
     * @return the founded EtudiantInfo , If no EtudiantInfo were
     *         found in database return  null.
     */
	EtudiantInfo findByCne(String cne);

    /**
     * find EtudiantInfo from database by id (id)
     * @param id - id of EtudiantInfo 
     * @return the founded  EtudiantInfo , If no EtudiantInfo were
     *         found in database return  null.
     */
	EtudiantInfo findById(Long id);
     
     /**
     * delete EtudiantInfo from database
     * @param id - id of EtudiantInfo to be deleted
     * 
     */
	void deleteById(Long id);

	List<EtudiantInfo> findBySexeRef(String ref);
    int deleteBySexeRef(String ref);       
			
    List<EtudiantInfo> findBySexeId(Long id);
    int deleteBySexeId(Long id);
			 
	List<EtudiantInfo> findByFormationActuelleRef(String ref);
    int deleteByFormationActuelleRef(String ref);       
			
    List<EtudiantInfo> findByFormationActuelleId(Long id);
    int deleteByFormationActuelleId(Long id);
			 
	List<EtudiantInfo> findByFonctionActuelleRef(String ref);
    int deleteByFonctionActuelleRef(String ref);       
			
    List<EtudiantInfo> findByFonctionActuelleId(Long id);
    int deleteByFonctionActuelleId(Long id);
			 
	List<EtudiantInfo> findByCompteEmail(String email);
    int deleteByCompteEmail(String email);       
			
    List<EtudiantInfo> findByCompteId(Long id);
    int deleteByCompteId(Long id);
			 
    /**
     * save EtudiantInfo in database
     * @param etudiantInfo - EtudiantInfo to be saved 
     * @return the saved EtudiantInfo, If the EtudiantInfo can't be saved return null.
     */
	EtudiantInfo save(EtudiantInfo etudiantInfo);

	/**
     * save list EtudiantInfo in database
     * @param etudiantInfos - list of EtudiantInfo to be saved 
     * @return the saved EtudiantInfo list
     */
	List<EtudiantInfo> save(List<EtudiantInfo> etudiantInfos);
    
     /**
     * update EtudiantInfo in database
     * @param etudiantInfo - EtudiantInfo to be updated
     * @return the updated EtudiantInfo, If the EtudiantInfo can't be updated return null.
     */
    EtudiantInfo update(EtudiantInfo etudiantInfo);
    
       /**
     * delete EtudiantInfo from database
     * @param etudiantInfo - EtudiantInfo to be deleted
     * @return 1 if EtudiantInfo deleted successfully, If the EtudiantInfo can't be deleted return negative int
     */
	int delete(EtudiantInfo etudiantInfo);


    
        /**
     * delete EtudiantInfo from database by cne (reference)
     * 
     * @param cne - reference of EtudiantInfo to be deleted
     * @return 1 if EtudiantInfo deleted successfully
     */
	int deleteByCne(String cne);

     
	/**
     * search for EtudiantInfo in by some criteria
     * @return the searhed list EtudiantInfo 
     */
	List<EtudiantInfo> findByCriteria( EtudiantInfoVo etudiantInfoVo);
}