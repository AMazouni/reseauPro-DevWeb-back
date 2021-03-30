package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.CatDemande;


@Repository
public interface CatDemandeDao extends JpaRepository<CatDemande,Long> {

	CatDemande findByRef(String ref);
       int deleteByRef(String ref);


}