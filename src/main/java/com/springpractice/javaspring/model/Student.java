package com.springpractice.javaspring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Table(name = "student_tbl")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //For Auto Increment (A.I)
    private Long studentId;
    private String name;
    private int age;
    private boolean isPresent;
    private double fee;
//    private Address address;


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isPresent=" + isPresent +
                ", fee=" + fee +
                '}';
    }




}
