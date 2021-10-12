package com.example.springwebapp.controller;

import com.example.springwebapp.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Denis on 2/20/2016.
 */

@Controller
public class Home {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/home-with-session")
    public String homeWithSession(Model model, HttpSession session) {
        String sid = session.getId();
        model.addAttribute("sid", sid);

//        ArrayList<Product> products = new ArrayList<>();
//        products.add(new Product("КОФЕ МОЛОТЫЙ TASTY COFFEE БРАУН КЭНДИ 250Г", 300, new Date()));
//        products.add(new Product("КОФЕ МОЛОТЫЙ TASTY COFFEE БАРИСТА 250Г", 320, new Date()));
//        products.add(new Product("КОФЕ МОЛОТЫЙ TASTY COFFEE БЛЭК КЭНДИ 250Г", 300, new Date()));
//        products.add(new Product("КОФЕ В ЗЕРНАХ TASTY COFFEE БЛЭК КЭНДИ 250Г", 250, new Date()));
//        products.add(new Product("КОФЕ В ЗЕРНАХ TASTY COFFEE БАРИСТА 250Г", 290, new Date()));
//        products.add(new Product("КОФЕ В ЗЕРНАХ TASTY COFFEE КОЛУМБИЯ УИЛА 250Г", 350, new Date()));
//        model.addAttribute("products", products);
        return "index";
    }
}
