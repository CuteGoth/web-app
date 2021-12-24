package com.example.springwebapp.controllers;
import com.example.springwebapp.models.Item;
import com.example.springwebapp.services.CityService;
import com.example.springwebapp.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Home {

    private final ProductService productService;

    private final CityService cityService;

    public Home(ProductService productService, CityService cityService) {
        this.productService = productService;
        this.cityService = cityService;
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/home-with-session")
    public String homeWithSession(Model model, HttpSession session) {
        String sid = session.getId();
        model.addAttribute("sid", sid);
        model.addAttribute("products", productService.getAll());
        model.addAttribute("cities", cityService.getAll());
        return "index";
    }

    @GetMapping("/cart")
    public String cartList(@SessionAttribute("cart") List<Item> cartList, Model model) {
        model.addAttribute("cart", cartList);
        return "cart";
    }
}
