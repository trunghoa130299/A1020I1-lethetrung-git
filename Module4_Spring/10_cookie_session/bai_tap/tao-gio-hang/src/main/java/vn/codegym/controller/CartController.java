package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.Cart;
import vn.codegym.service.CartService;
import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes("carts")
public class CartController {
    @Autowired
    CartService cartService;

    @ModelAttribute("carts")
    public HashMap<Integer ,Cart> getShowInfo() {
        return new HashMap<>();
    }
    @GetMapping("/list")
    public String showCart(@SessionAttribute("carts") HashMap<Integer,Cart> cartHashMap,Model model){
        model.addAttribute("cartList",cartHashMap);
        model.addAttribute("cartNum" ,cartHashMap.size());
        model.addAttribute("cartPrice",totalPrice(cartHashMap));
        return "cart";
    }
    @GetMapping("/index")
    public String showIndex(Model model) {
        model.addAttribute("listCart", this.cartService.findAll());
        return "index";
    }
    @GetMapping("/delete/{id}")
    public String deleteCart(@PathVariable int id,@SessionAttribute("carts") HashMap<Integer,Cart> cartHashMap,Model model){
        if (cartHashMap ==  null){
            cartHashMap = new HashMap<>();
        }
        cartHashMap.remove(id);
        model.addAttribute("cartList",cartHashMap);
        model.addAttribute("cartNum" ,cartHashMap.size());
        model.addAttribute("cartPrice",totalPrice(cartHashMap));
        return "redirect:/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("cart", cartService.findById(id));
        return "view";
    }
    @GetMapping("/buycart/{id}")
    public String addCart(@PathVariable int id, @SessionAttribute("carts") HashMap<Integer,Cart> cartHashMap, Model model) {
        if (cartHashMap ==  null){
            cartHashMap = new HashMap<>();
        }
         Cart cart  = this.cartService.findById(id);
        if (cart != null){
            if (cartHashMap.containsKey(id)){
                cart =cartHashMap.get(id);
                cart.setAmount(cart.getAmount() + 1);
                cartHashMap.put(id,cart);
            }else {
                cart.setAmount(1);
                cartHashMap.put(id,cart);
            }
        }
        model.addAttribute("cartList",cartHashMap);
        model.addAttribute("cartNum" ,cartHashMap.size());
        model.addAttribute("cartPrice",totalPrice(cartHashMap));
        return "cart";
    }
    public int totalPrice(HashMap<Integer,Cart> cartHashMap){
        int count =0;
        for (Map.Entry<Integer,Cart> list : cartHashMap.entrySet()){
            count+= list.getValue().getPrice() * list.getValue().getAmount();
        }
        return count;
    }
}
