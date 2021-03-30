package ma.zs.generated.service.facade;

import java.util.List;
import ma.zs.generated.bean.Utilisateur;
import ma.zs.generated.ws.rest.provided.vo.UtilisateurVo;

public interface UtilisateurService {

        /**

     * find all Utilisateur in database 
     * @return List<Utilisateur> , If database is empty return  null.
     */
	List<Utilisateur> findAll();
	   
	/**

     * find Utilisateur from database by email (reference)
     * @param email - reference of Utilisateur 
     * @return the founded Utilisateur , If no Utilisateur were
     *         found in database return  null.
     */
	Utilisateur findByEmail(String email);

    /**
     * find Utilisateur from database by id (id)
     * @param id - id of Utilisateur 
     * @return the founded  Utilisateur , If no Utilisateur were
     *         found in database return  null.
     */
	Utilisateur findById(Long id);
     
     /**
     * delete Utilisateur from database
     * @param id - id of Utilisateur to be deleted
     * 
     */
	void deleteById(Long id);

	List<Utilisateur> findByAdminInfoNom(String nom);
    int deleteByAdminInfoNom(String nom);       
			
    List<Utilisateur> findByAdminInfoId(Long id);
    int deleteByAdminInfoId(Long id);
			 
	List<Utilisateur> findByLaureatInfoCne(String cne);
    int deleteByLaureatInfoCne(String cne);       
			
    List<Utilisateur> findByLaureatInfoId(Long id);
    int deleteByLaureatInfoId(Long id);
			 
	List<Utilisateur> findByEtudiantInfoCne(String cne);
    int deleteByEtudiantInfoCne(String cne);       
			
    List<Utilisateur> findByEtudiantInfoId(Long id);
    int deleteByEtudiantInfoId(Long id);
			 
	List<Utilisateur> findByProfesseurInfoCode(String code);
    int deleteByProfesseurInfoCode(String code);       
			
    List<Utilisateur> findByProfesseurInfoId(Long id);
    int deleteByProfesseurInfoId(Long id);
			 
	List<Utilisateur> findByReponsesReponse(String reponse);
    int deleteByReponsesReponse(String reponse);       
			
    List<Utilisateur> findByReponsesId(Long id);
    int deleteByReponsesId(Long id);
			 
    /**
     * save Utilisateur in database
     * @param utilisateur - Utilisateur to be saved 
     * @return the saved Utilisateur, If the Utilisateur can't be saved return null.
     */
	Utilisateur save(Utilisateur utilisateur);

	/**
     * save list Utilisateur in database
     * @param utilisateurs - list of Utilisateur to be saved 
     * @return the saved Utilisateur list
     */
	List<Utilisateur> save(List<Utilisateur> utilisateurs);
    
     /**
     * update Utilisateur in database
     * @param utilisateur - Utilisateur to be updated
     * @return the updated Utilisateur, If the Utilisateur can't be updated return null.
     */
    Utilisateur update(Utilisateur utilisateur);
    
       /**
     * delete Utilisateur from database
     * @param utilisateur - Utilisateur to be deleted
     * @return 1 if Utilisateur deleted successfully, If the Utilisateur can't be deleted return negative int
     */
	int delete(Utilisateur utilisateur);


    
        /**
     * delete Utilisateur from database by email (reference)
     * 
     * @param email - reference of Utilisateur to be deleted
     * @return 1 if Utilisateur deleted successfully
     */
	int deleteByEmail(String email);

     
	/**
     * search for Utilisateur in by some criteria
     * @return the searhed list Utilisateur 
     */
	List<Utilisateur> findByCriteria( UtilisateurVo utilisateurVo);
}