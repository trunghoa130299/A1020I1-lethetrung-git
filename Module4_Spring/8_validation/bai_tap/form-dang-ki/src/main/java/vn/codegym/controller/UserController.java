package vn.codegym.controller;

import com.oracle.jrockit.jfr.ValueDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.User;
import vn.codegym.repository.UserRepository;

@Controller
public class UserController {
    @Autowired
    UserRepository repository;
    @GetMapping(value = "/create")
    public String showCreate(@ModelAttribute User user, Model model){
        model.addAttribute("user",new User());
        return "index";
    }
    @PostMapping(value = "/create")
    public String createUser(@Validated @ModelAttribute User user, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return "index";
        }else {
            model.addAttribute("message","Create done");
            this.repository.save(user);
            return "result";
        }
    }
}
