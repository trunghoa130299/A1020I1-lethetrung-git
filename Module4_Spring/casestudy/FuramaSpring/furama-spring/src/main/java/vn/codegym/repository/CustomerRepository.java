package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;

@Service
public interface CustomerRepository  extends JpaRepository<Customer ,String> {
}
