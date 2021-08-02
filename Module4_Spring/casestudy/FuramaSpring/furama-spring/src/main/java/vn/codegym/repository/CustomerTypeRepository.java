package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import vn.codegym.model.CustomerType;

@Service
public interface CustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
