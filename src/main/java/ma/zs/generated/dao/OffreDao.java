package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Offre;


@Repository
public interface OffreDao extends JpaRepository<Offre,Long> {

	Offre findByRef(String ref);
       int deleteByRef(String ref);

       List<Offre> findByTagsRef(String ref);
       int deleteByTagsRef(String ref);       
       List<Offre> findByTagsId(Long id);
       int deleteByTagsId(Long id);
       List<Offre> findByFonctionRef(String ref);
       int deleteByFonctionRef(String ref);       
       List<Offre> findByFonctionId(Long id);
       int deleteByFonctionId(Long id);

}