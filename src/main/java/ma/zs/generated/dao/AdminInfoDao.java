package ma.zs.generated.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import ma.zs.generated.bean.AdminInfo;


@Repository
public interface AdminInfoDao extends JpaRepository<AdminInfo,Long> {

	AdminInfo findByNom(String nom);
       int deleteByNom(String nom);

       List<AdminInfo> findByCompteEmail(String email);
       int deleteByCompteEmail(String email);       
       List<AdminInfo> findByCompteId(Long id);
       int deleteByCompteId(Long id);

}