package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Entreprise;


@Repository
public interface EntrepriseDao extends JpaRepository<Entreprise,Long> {

	Entreprise findByRef(String ref);
       int deleteByRef(String ref);


}