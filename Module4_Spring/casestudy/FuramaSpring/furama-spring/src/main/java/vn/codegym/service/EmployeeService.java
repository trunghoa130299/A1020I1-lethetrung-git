package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
