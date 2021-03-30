package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Message;


@Repository
public interface MessageDao extends JpaRepository<Message,Long> {

	Message findByRef(String ref);
       int deleteByRef(String ref);

       List<Message> findByEmetteurEmail(String email);
       int deleteByEmetteurEmail(String email);       
       List<Message> findByEmetteurId(Long id);
       int deleteByEmetteurId(Long id);
       List<Message> findByDemandeConcerneRef(String ref);
       int deleteByDemandeConcerneRef(String ref);       
       List<Message> findByDemandeConcerneId(Long id);
       int deleteByDemandeConcerneId(Long id);

}