package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.Employee;

@Controller
public class EmployeeController {
    @GetMapping(value = "/create")
    public String showForm(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "create";
    }

    @PostMapping(value = "/addEmployee")
    public String submit(@Valid Employee employee, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "create";
        } else {
            model.addAttribute("name", employee.getName());
            model.addAttribute("contactNumber", employee.getContactNumber());
            model.addAttribute("id", employee.getId());
            return "info";
        }
    }
}
