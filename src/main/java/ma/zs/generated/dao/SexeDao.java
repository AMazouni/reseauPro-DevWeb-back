package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Sexe;


@Repository
public interface SexeDao extends JpaRepository<Sexe,Long> {

	Sexe findByRef(String ref);
       int deleteByRef(String ref);


}