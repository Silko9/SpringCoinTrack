package ru.shapov.springlab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {
    @GetMapping("/sign-in")
    public String signIn(Model model){
        //model.addAttribute("student", new Student());
        return "sign-in";
    }
}
