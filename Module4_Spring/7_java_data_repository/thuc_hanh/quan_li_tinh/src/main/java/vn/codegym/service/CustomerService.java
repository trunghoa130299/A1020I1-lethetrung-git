package vn.codegym.service;

import vn.codegym.model.Customer;
import vn.codegym.model.Province;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
    Iterable<Customer> findAllByProvince(Province province);
}
