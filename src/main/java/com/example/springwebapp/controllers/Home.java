package com.example.springwebapp.controllers;

import com.example.springwebapp.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Denis on 2/20/2016.
 */

@Controller
public class Home {

    private final ProductService productService;

    public Home(ProductService productService) {
        this.productService = productService;
    }


    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/home-with-session")
    public String homeWithSession(Model model, HttpSession session) {
        String sid = session.getId();
        model.addAttribute("sid", sid);
        model.addAttribute("products", productService.getBySortHighToLow());
        return "index";
    }
}
