package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Commentaire;


@Repository
public interface CommentaireDao extends JpaRepository<Commentaire,Long> {

	Commentaire findByComref(String comref);
       int deleteByComref(String comref);

       List<Commentaire> findByPublicationRef(String ref);
       int deleteByPublicationRef(String ref);       
       List<Commentaire> findByPublicationId(Long id);
       int deleteByPublicationId(Long id);
       List<Commentaire> findByPosteParEmail(String email);
       int deleteByPosteParEmail(String email);       
       List<Commentaire> findByPosteParId(Long id);
       int deleteByPosteParId(Long id);

}