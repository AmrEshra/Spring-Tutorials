package com.edureka.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
    
    @GetMapping("/securedPage")
    public String securedPage() {
        return "securedPage";
    }
}
