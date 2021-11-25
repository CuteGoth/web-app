package com.example.springwebapp.controllers;
import com.example.springwebapp.services.CityService;
import com.example.springwebapp.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

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
    public String cartEnter() {
        return "cart";
    }

}
