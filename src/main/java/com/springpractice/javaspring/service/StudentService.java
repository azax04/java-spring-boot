package com.springpractice.javaspring.service;

import com.springpractice.javaspring.model.Student;
import com.springpractice.javaspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Iterable<Student> getAllStudents(){
        return studentRepository.findAll();

    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudentById(Long studentId){
        studentRepository.deleteById(studentId);
    }

    public Student updateStudent(){
        return null;
    }

}
