package com.Cabrera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/eventos")
    public String eventos() {
        return "eventos";
    }
    
}
