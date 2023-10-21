package ru.shapov.springlab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.shapov.springlab.models.Student;
import ru.shapov.springlab.services.StudentService;

import java.util.List;

@Controller
public class StudentController {
    private StudentService service;

    @Autowired
    public void setService(StudentService service) {this.service = service;}

    @GetMapping("/institut")
    public String studentView(Model model){
        List<Student> studentList = service.getAllStudents();
        model.addAttribute("students", studentList);
        return "institut";
    }

    @GetMapping("/students/delete/{id}")
    public String deleteStudentById(@PathVariable("id") Long id){
        service.deleteStudentById(id);
        return "redirect:/institut";
    }
}
