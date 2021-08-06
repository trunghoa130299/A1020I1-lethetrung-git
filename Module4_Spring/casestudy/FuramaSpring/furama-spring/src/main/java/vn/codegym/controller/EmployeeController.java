package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.*;
import vn.codegym.service.DivisionService;
import vn.codegym.service.EducationDegreeService;
import vn.codegym.service.EmployeeService;
import vn.codegym.service.PositionService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    EducationDegreeService educationDegreeService;

    @Autowired
    PositionService positionService;

    @Autowired
    DivisionService divisionService;

    @ModelAttribute("positions")
    public List<Position> positionList() {
        return positionService.findAll();
    }

    @ModelAttribute("educationDegrees")
    public List<EducationDegree> educationDegreeList() {
        return educationDegreeService.findAll();
    }

    @ModelAttribute("divisions")
    public List<Division> divisionList() {
        return divisionService.findAll();
    }

    @GetMapping(value = "/employee")
    public String showListEmployee(Model model) {
        List<Employee> employeeList = employeeService.findAll();
        model.addAttribute("employeeList", employeeList);
        return "employee/Employee";
    }

    @GetMapping(value = "/createEmployee")
    public String showCreate(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee/CreateEmployee";
    }

    @PostMapping(value = "/addEmployee")
    public String createEmployee(@Valid @ModelAttribute Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "employee/CreateEmployee";
        }
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @PostMapping(value = "/deleteEp")
    public String deleteEmployee(@RequestParam(name = "idEmployee") int id) {
        employeeService.remove(id);
        return "redirect:/employee";
    }
    @GetMapping(value = "/editEmployee/{id}")
    public String showEdit(@PathVariable("id") int id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "employee/EditEmployee";
    }

    @PostMapping(value = "/editEp")
    public String editCustomer(@ModelAttribute("employee") Employee employee, Model model) {
        employeeService.save(employee);
        model.addAttribute("employee", employee);
        return "employee/EditEmployee";
    }
    @GetMapping(value = "/viewEmployee/{id}")
    public String viewCustomer(@PathVariable("id") int id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "employee/view";
    }

}
