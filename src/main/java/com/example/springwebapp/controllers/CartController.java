package com.example.springwebapp.controllers;

import com.example.springwebapp.models.Item;
import com.example.springwebapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CartController {

//    @RequestMapping
//    public String cart() {
//        return "cart";
//    }


//    @RequestMapping(value = "buy/{id}", method = RequestMethod.GET)
//    public String toCart(@PathVariable("id") long id, ModelMap modelMap, HttpSession session) {
//        if(session.getAttribute("cart") == null) {
//            List<Item> cart = new ArrayList<>();
//            cart.add(new Item(productService.find(id), 1));
//            session.setAttribute("cart", cart);
//        }
//        else {
//
//        }
//    }
}
