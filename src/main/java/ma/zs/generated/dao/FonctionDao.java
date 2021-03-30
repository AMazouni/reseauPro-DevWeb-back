package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Fonction;


@Repository
public interface FonctionDao extends JpaRepository<Fonction,Long> {

	Fonction findByRef(String ref);
       int deleteByRef(String ref);

       List<Fonction> findByEntrepriseRef(String ref);
       int deleteByEntrepriseRef(String ref);       
       List<Fonction> findByEntrepriseId(Long id);
       int deleteByEntrepriseId(Long id);
       List<Fonction> findByOccupeParCne(String cne);
       int deleteByOccupeParCne(String cne);       
       List<Fonction> findByOccupeParId(Long id);
       int deleteByOccupeParId(Long id);

}