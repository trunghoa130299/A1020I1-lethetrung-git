package vn.codegym.service;

import vn.codegym.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    void save(Employee employee);

    void remove(int id);

    Employee findById(int id);
}
