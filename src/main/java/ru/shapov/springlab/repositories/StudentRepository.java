package ru.shapov.springlab.repositories;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import ru.shapov.springlab.models.GenderEnum;
import ru.shapov.springlab.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class StudentRepository {
    private List<Student> students;
    public List<Student> getStudents() {return students;}
    public void deleteStudent(Student student){
        students.remove(student);
    }
    private StudentRepository(){}

    @PostConstruct
    public void init(){
        students = new ArrayList<>();
        students.add(new Student(1L, "Андрей", "Щапов", "Александрович", "Муром", 22, "ФИТР", "ПИН-120", GenderEnum.MAN));
        students.add(new Student(2L, "Олег", "Олегов", "Олегович", "Москва", 25, "ИТР", "ПИН-125", GenderEnum.MAN));
        students.add(new Student(3L, "Наталья", "Наталова", "Олеговна", "Владимир", 23, "ИИО", "ПИН-119", GenderEnum.WOMAN));
    }
}
