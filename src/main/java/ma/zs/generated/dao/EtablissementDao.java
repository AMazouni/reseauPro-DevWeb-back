package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Etablissement;


@Repository
public interface EtablissementDao extends JpaRepository<Etablissement,Long> {

	Etablissement findByRef(String ref);
       int deleteByRef(String ref);


}