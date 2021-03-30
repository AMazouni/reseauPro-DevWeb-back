package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Formation;


@Repository
public interface FormationDao extends JpaRepository<Formation,Long> {

	Formation findByRef(String ref);
       int deleteByRef(String ref);

       List<Formation> findByEtablissementRef(String ref);
       int deleteByEtablissementRef(String ref);       
       List<Formation> findByEtablissementId(Long id);
       int deleteByEtablissementId(Long id);
       List<Formation> findByResponsableCode(String code);
       int deleteByResponsableCode(String code);       
       List<Formation> findByResponsableId(Long id);
       int deleteByResponsableId(Long id);

}