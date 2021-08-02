package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.codegym.model.Employee;
import vn.codegym.service.EmployeeService;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping(value = "/employee")
    public String showListEmployee(Model model){
        List<Employee> employeeList = employeeService.findAll();
        model.addAttribute("employeeList",employeeList);
        return "employee/Employee";
    }
}
