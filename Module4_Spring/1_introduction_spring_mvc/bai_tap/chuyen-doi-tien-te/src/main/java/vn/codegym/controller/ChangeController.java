package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeController {
    @RequestMapping(value = "/change" ,method = RequestMethod.GET)
    public String a(){
        return "change";
    }
    @RequestMapping(value = "/change",method = RequestMethod.POST)
    public   String changeUsd(@RequestParam (name = "usd") String usd, Model model){
        int result = Integer.parseInt(usd) * 23000;
        model.addAttribute("result" ,result);
        return "change";
    }
}
