package model.service.impl;

import model.bean.*;
import model.repository.ResortRepository;
import model.repository.impl.ResortRepositoryImpl;
import model.service.ResortService;

import java.util.List;

public class ResortServiceImpl implements ResortService {
    private ResortRepository resortRepository = new ResortRepositoryImpl();
    @Override
    public List<Customer> findAll() {
        return this.resortRepository.findAll();
    }

    @Override
    public boolean createCustomer(Customer customer) {
        this.resortRepository.createCustomer(customer);
        return true;
    }

    @Override
    public Customer findById(int id) {
        return this.resortRepository.findById(id);
    }

    @Override
    public boolean updateCustomer(int id, Customer customer) {
        return this.resortRepository.updateCustomer(id,customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return this.resortRepository.deleteCustomer(id);
    }

    @Override
    public List<Employee> findListEmployee() {
        return this.resortRepository.findListEmployee();
    }

    @Override
    public boolean createEmployee(Employee employee) {
        return this.resortRepository.createEmployee(employee);
    }

    @Override
    public Employee findByIdEmployee(int id) {
        return this.resortRepository.findByIdEmployee(id);
    }

    @Override
    public boolean updateEmployee(int id, Employee employee) {
        return this.resortRepository.updateEmployee(id,employee);
    }

    @Override
    public List<Customer> findNameCustomer(String name) {
        return this.resortRepository.findNameCustomer(name);
    }

    @Override
    public List<Employee> findNameEmployee(String name) {
        return this.resortRepository.findNameEmployee(name);
    }

    @Override
    public boolean deleteEmployee(int id) {
        return this.resortRepository.deleteEmployee(id);
    }


    @Override
    public Login checkLogin(String username, String password) {
        return this.resortRepository.checkLogin(username,password);
    }

    @Override
    public boolean createUser(Login login) {
        return this.resortRepository.createUser(login);
    }
}
