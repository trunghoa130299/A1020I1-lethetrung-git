package vn.codegym.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import vn.codegym.model.Province;

public interface ProvinceRepository extends PagingAndSortingRepository<Province, Long> {
    Province findOne(Long id);
}
