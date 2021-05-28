package model.service.impl;

import model.bean.Customer;
import model.bean.Employee;
import model.bean.Service;
import model.reponsitory.FuramaRepository;
import model.reponsitory.impl.FuramaRepositoryImpl;
import model.service.FuramaService;

import java.util.List;

public class FuramaServiceImpl implements FuramaService {
    private FuramaRepository furamaRepository = new FuramaRepositoryImpl();
    @Override
    public List<Customer> findAll() {
        return this.furamaRepository.findAll();
    }

    @Override
    public boolean createCustomer(Customer customer) {
        this.furamaRepository.createCustomer(customer);
        return true;
    }

    @Override
    public Customer findById(int id) {
        return this.furamaRepository.findById(id);
    }

    @Override
    public boolean updateCustomer(int id, Customer customer) {
        return this.furamaRepository.updateCustomer(id,customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return this.furamaRepository.deleteCustomer(id);
    }

    @Override
    public List<Employee> findListEmployee() {
        return this.furamaRepository.findListEmployee();
    }

    @Override
    public boolean createEmployee(Employee employee) {
        return this.furamaRepository.createEmployee(employee);
    }

    @Override
    public Employee findByIdEmployee(int id) {
        return this.furamaRepository.findByIdEmployee(id);
    }

    @Override
    public boolean updateEmployee(int id, Employee employee) {
        return this.furamaRepository.updateEmployee(id,employee);
    }

    @Override
    public List<Customer> findNameCustomer(String name) {
        return this.furamaRepository.findNameCustomer(name);
    }

    @Override
    public List<Employee> findNameEmployee(String name) {
        return this.furamaRepository.findNameEmployee(name);
    }

    @Override
    public boolean createService(Service service) {
        return this.furamaRepository.createService(service);
    }

    @Override
    public boolean deleteEmployee(int id) {
        return this.furamaRepository.deleteEmployee(id);
    }
}
