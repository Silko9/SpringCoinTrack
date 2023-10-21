package ru.shapov.springlab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.shapov.springlab.models.Student;
import ru.shapov.springlab.services.StudentService;

import java.util.Optional;

@Controller
public class DetailsController {
    private StudentService service;

    @Autowired
    public void setService(StudentService service) {this.service = service;}

    @GetMapping("/details/{id}")
    public String detailsView(Model model, @PathVariable("id") Long studentId){
        Optional<Student> student = service.getStudentById(studentId);
        model.addAttribute("student", student.orElse(null));
        return "details";
    }
}
