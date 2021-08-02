package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import vn.codegym.model.Employee;

@Service
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
