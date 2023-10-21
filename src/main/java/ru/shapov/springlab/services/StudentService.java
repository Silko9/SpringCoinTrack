package ru.shapov.springlab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shapov.springlab.models.Student;
import ru.shapov.springlab.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository repository;

    @Autowired
    public void setRepository(StudentRepository repository) {this.repository = repository;}

    public List<Student> getAllStudents(){return repository.getStudents();}

    public Optional<Student> getStudentById(Long id){
        Optional<Student> student = Optional.empty();
        List<Student> studentList = repository.getStudents();
        for (Student item: studentList) {
            if(id == item.getId())
                student = Optional.of(item);
        }
        return student;
    }

    public boolean deleteStudentById(Long id){
        Optional<Student> student = getStudentById(id);
        if(student.isEmpty()) return false;
        repository.deleteStudent(student.get());
        return true;
    }
}
