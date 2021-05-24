package model.reponsitory;

import model.bean.Customer;

import java.util.List;

public interface FuramaRepository {
    List<Customer> findAll();
    boolean createCustomer(Customer customer);
    Customer findById(int id);
    boolean updateCustomer(int id, Customer customer);
    boolean deleteCustomer(int id);
}
