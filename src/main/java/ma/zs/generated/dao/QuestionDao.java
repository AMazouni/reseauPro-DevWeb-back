package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Question;


@Repository
public interface QuestionDao extends JpaRepository<Question,Long> {

	Question findByFormule(String formule);
       int deleteByFormule(String formule);


}