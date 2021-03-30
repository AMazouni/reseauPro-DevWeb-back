package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Reponse;


@Repository
public interface ReponseDao extends JpaRepository<Reponse,Long> {

	Reponse findByReponse(String reponse);
       int deleteByReponse(String reponse);

       List<Reponse> findByQuestionFormule(String formule);
       int deleteByQuestionFormule(String formule);       
       List<Reponse> findByQuestionId(Long id);
       int deleteByQuestionId(Long id);

}