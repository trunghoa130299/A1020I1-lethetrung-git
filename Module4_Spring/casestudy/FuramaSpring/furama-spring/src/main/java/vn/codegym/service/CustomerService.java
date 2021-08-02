package vn.codegym.service;

import vn.codegym.model.Customer;
import java.util.List;
public interface CustomerService {
    Customer findById(String id);

    List<Customer> findAll();

    void save(Customer customer);

    void update(Customer customer);

    void delete(String id);
}
