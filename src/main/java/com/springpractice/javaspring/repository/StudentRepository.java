package com.springpractice.javaspring.repository;

import com.springpractice.javaspring.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> { //Crud = Create Read Update Delete
}
