package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.OffreTags;


@Repository
public interface OffreTagsDao extends JpaRepository<OffreTags,Long> {

	OffreTags findByRef(String ref);
       int deleteByRef(String ref);


}