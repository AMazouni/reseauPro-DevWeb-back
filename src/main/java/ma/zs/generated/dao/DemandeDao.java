package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Demande;


@Repository
public interface DemandeDao extends JpaRepository<Demande,Long> {

	Demande findByRef(String ref);
       int deleteByRef(String ref);

       List<Demande> findByCategorieDemandeRef(String ref);
       int deleteByCategorieDemandeRef(String ref);       
       List<Demande> findByCategorieDemandeId(Long id);
       int deleteByCategorieDemandeId(Long id);
       List<Demande> findByDemandeParCne(String cne);
       int deleteByDemandeParCne(String cne);       
       List<Demande> findByDemandeParId(Long id);
       int deleteByDemandeParId(Long id);
       List<Demande> findByStatusCode(String code);
       int deleteByStatusCode(String code);       
       List<Demande> findByStatusId(Long id);
       int deleteByStatusId(Long id);
       List<Demande> findByDemandeACne(String cne);
       int deleteByDemandeACne(String cne);       
       List<Demande> findByDemandeAId(Long id);
       int deleteByDemandeAId(Long id);

}