package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.model.Customer;
import vn.codegym.model.Province;


public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
