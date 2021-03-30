package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Candidature;


@Repository
public interface CandidatureDao extends JpaRepository<Candidature,Long> {

	Candidature findByRef(String ref);
       int deleteByRef(String ref);

       List<Candidature> findByCandidatCne(String cne);
       int deleteByCandidatCne(String cne);       
       List<Candidature> findByCandidatId(Long id);
       int deleteByCandidatId(Long id);
       List<Candidature> findByStatusCode(String code);
       int deleteByStatusCode(String code);       
       List<Candidature> findByStatusId(Long id);
       int deleteByStatusId(Long id);
       List<Candidature> findByOffreConcerneRef(String ref);
       int deleteByOffreConcerneRef(String ref);       
       List<Candidature> findByOffreConcerneId(Long id);
       int deleteByOffreConcerneId(Long id);

}