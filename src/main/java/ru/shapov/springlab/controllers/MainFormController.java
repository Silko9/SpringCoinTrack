package ru.shapov.springlab.controllers;

import com.ibm.icu.text.Transliterator;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.shapov.springlab.models.Student;

import java.util.Random;

@Controller
public class MainFormController {
    @GetMapping("/form")
    public String mainForm(Model model){
        //model.addAttribute("student", new Student());
        return "main-form";
    }

    @PostMapping("/form")
    public String mainForm(@ModelAttribute Student student, Model model){

        return "result";
    }
}
