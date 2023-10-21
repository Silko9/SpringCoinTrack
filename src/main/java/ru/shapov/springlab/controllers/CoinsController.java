package ru.shapov.springlab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoinsController {
    @GetMapping("/coins")
    public String coinsView(Model model){
        return "coins";
    }
}
