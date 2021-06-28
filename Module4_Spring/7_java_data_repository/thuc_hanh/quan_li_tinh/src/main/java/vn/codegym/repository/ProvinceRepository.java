package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.codegym.model.Province;

public interface ProvinceRepository extends JpaRepository<Province,Long> {
    @Query("select p from Province p where p.id=:id1")
    Province findOne(@Param("id1") long id);
}
