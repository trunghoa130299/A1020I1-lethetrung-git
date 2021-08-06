package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.Customer;
import vn.codegym.model.CustomerType;
import vn.codegym.service.CustomerService;
import vn.codegym.service.CustomerTypeService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;

    @ModelAttribute("customerTypies")
    public List<CustomerType> customerTypeList() {
        return customerTypeService.findAll();
    }

    @GetMapping(value = "/customer/{id}")
    public String editCustomer(@PathVariable("id") String id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "customer/EditCustomer";
    }

    @GetMapping(value = "/customer")
    public String showListCustomer(Model model) {
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customerList", customerList);
        return "customer/Customer";
    }

    @GetMapping(value = "/createCustomer")
    public String showCreateCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/CreateCustomer";
    }

    @PostMapping(value = "/addCustomer")
    public String createCustomer(@Valid @ModelAttribute Customer customer, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "customer/CreateCustomer";
        }
        customerService.save(customer);
        model.addAttribute("customer", customer);
        return "redirect:/customer";
    }

    @GetMapping(value = "/editCustomer/{id}")
    public String showEdit(@PathVariable("id") String id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "customer/EditCustomer";
    }

    @PostMapping(value = "/edit")
    public String editCustomer(@ModelAttribute("customer") Customer customer, Model model) {
        customerService.update(customer);
        model.addAttribute("customer", customer);
        return "customer/EditCustomer";
    }

    @PostMapping(value = "/delete")
    public String deleteCustomer(@RequestParam(name = "idCustomer") String id) {
        customerService.delete(id);
        return "redirect:/customer";
    }

    @GetMapping(value = "/viewCustomer/{id}")
    public String viewCustomer(@PathVariable("id") String id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "customer/View";
    }
}