package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.EtudiantInfo;


@Repository
public interface EtudiantInfoDao extends JpaRepository<EtudiantInfo,Long> {

	EtudiantInfo findByCne(String cne);
       int deleteByCne(String cne);

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

}