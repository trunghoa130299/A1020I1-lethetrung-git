package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
    @RequestMapping (value = "/list",method = RequestMethod.GET)
    public String listCustomer(Model model){
        return "list";
    }
}
