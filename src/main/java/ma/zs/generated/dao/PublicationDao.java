package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Publication;


@Repository
public interface PublicationDao extends JpaRepository<Publication,Long> {

	Publication findByRef(String ref);
       int deleteByRef(String ref);

       List<Publication> findByPosteParEmail(String email);
       int deleteByPosteParEmail(String email);       
       List<Publication> findByPosteParId(Long id);
       int deleteByPosteParId(Long id);

}