package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TuDienController {
    @RequestMapping(value = "/main" ,method = RequestMethod.GET)
    public String mainIndex(){
        return "main";
    }
    @RequestMapping(value = "/main",method = RequestMethod.POST)
    public String mainPost(@RequestParam(name = "search") String search, Model model){
        Map<String , String>  dic = new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
        String result =dic.get(search);
        if (result != null){
            model.addAttribute("search",search);
            model.addAttribute("result",result);
        }else {
            model.addAttribute("msg","Not Found");
        }
        return "main";
    }
}
