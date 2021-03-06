package model.service;

import model.bean.*;

import java.util.List;

public interface ResortService {
    List<Customer> findAll();
    boolean createCustomer(Customer customer);
    Customer findById(int id);

    boolean updateCustomer(int id, Customer customer);
    boolean deleteCustomer(int id);

    List<Employee> findListEmployee();

    boolean createEmployee(Employee employee);

    Employee findByIdEmployee(int id);
    boolean updateEmployee(int id,Employee employee);

    List<Customer> findNameCustomer(String name);

    List<Employee> findNameEmployee(String name);

    boolean deleteEmployee(int id);

    Login checkLogin(String username , String password);

    boolean createUser(Login login);
}
