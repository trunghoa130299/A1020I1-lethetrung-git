package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuramaController {
    @GetMapping("/home")
    public String showHome(){
        return "home";
    }
    @GetMapping("/login")
    public String showLogin(){
        return "login";
    }
}
