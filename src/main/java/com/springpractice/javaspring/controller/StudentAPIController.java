package com.springpractice.javaspring.controller;

import com.springpractice.javaspring.model.Address;
import com.springpractice.javaspring.model.Student;
import com.springpractice.javaspring.repository.StudentRepository;
import com.springpractice.javaspring.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Slf4j
public class StudentAPIController {

//    @Autowired
//    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

//    @GetMapping(value = "/student")
//    public Iterable<Student> listOfStudents()
//    {
//        return studentRepository.findAll();
//    }

    @GetMapping(value = "/student")
    public Iterable<Student> getAllStudent(){

        return studentService.getAllStudents();
    }

    @DeleteMapping(value = "/student")
    public String deleteStudent(){
        studentService.deleteStudentById(5L);
        return "Delete Student";
    }


//        Address address = new Address("Kathmandu", "Bagmati", "Nepal");
//        Student student1 = new Student("Ram", 10, true, 5000, address);
//        Student student2 = new Student("Shyam", 15, true, 8000, address);
//
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        return students;
//    }
    
    @PostMapping(value = "/student")
    public String createNewStudent(@RequestBody Student student){ //@RequestBody means to put the value by user
        log.info(student.toString());
//        Student student2 = new Student(8L, "Hari", 18, false, 12000);
//        studentService.saveStudent(student2);
        return "Create New Student";
    }

    @PutMapping(value = "/student")
    public String updateStudent(){
        studentService.updateStudent();
        return "Update existing student";
    }
    
    
}
