package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping(value = "/caculate")
    public String mainGet(){
        return "caculate";
    }
    @PostMapping(value = "/caculate")
    public String mainPost(@RequestParam("numberone") Float a, @RequestParam("numbertwo") Float b, @RequestParam("select") char operator, Model model){
        float result = CaculatorController.caculate(a,b,operator);
        model.addAttribute("resultNumber",result);
        return "caculate";
    }
    public static float caculate(float numberone , float numbertwo, char operator){
        switch (operator){
            case '+' :
                return  numberone + numbertwo;
            case '-' :
                return  numberone- numbertwo;
            case '*' :
                return numberone * numbertwo;
            case '/' :
                if (numbertwo != 0 ){
                    return numberone / numbertwo ;
                }
                else {
                    throw new RuntimeException("Can't divide by zero");
                }
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
    }
}
