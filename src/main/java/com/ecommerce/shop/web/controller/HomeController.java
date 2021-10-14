package com.ecommerce.shop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/index")
    public String getIndex(){
        return "indexPage";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }

    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }
    @GetMapping("/products")
    public String getProduct(){
        return "product";
    }
    @GetMapping("/services")
    public String getServices(){
        return "services";
    }
    @GetMapping("/single")
    public String getSingle(){
        return "single";
    }
}



