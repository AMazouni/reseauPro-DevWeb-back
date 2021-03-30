package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.ProfesseurInfo;


@Repository
public interface ProfesseurInfoDao extends JpaRepository<ProfesseurInfo,Long> {

	ProfesseurInfo findByCode(String code);
       int deleteByCode(String code);

       List<ProfesseurInfo> findByEtablissementRef(String ref);
       int deleteByEtablissementRef(String ref);       
       List<ProfesseurInfo> findByEtablissementId(Long id);
       int deleteByEtablissementId(Long id);
       List<ProfesseurInfo> findByCompteEmail(String email);
       int deleteByCompteEmail(String email);       
       List<ProfesseurInfo> findByCompteId(Long id);
       int deleteByCompteId(Long id);

}