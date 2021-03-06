package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.Status;


@Repository
public interface StatusDao extends JpaRepository<Status,Long> {

	Status findByCode(String code);
       int deleteByCode(String code);


}