package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Utilisateur;


@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Long> {

	Utilisateur findByEmail(String email);
       int deleteByEmail(String email);

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

}