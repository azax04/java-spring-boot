package com.springpractice.javaspring.controller;


import org.springframework.web.bind.annotation.*;


//There are two types of controller
//RestController and WebController
@RestController
@RequestMapping(value = "/api")
public class APIController {

    @GetMapping(value = "/user")
    public String getAllUser (){
        return "Get all users in the Application";
    }

    @PostMapping(value = "/user")
    public String createUser(){
        return "Create new User";
    }

    @PutMapping(value = "/user")
    public String updateUser (){
        return "Update the existing user";
    }

    @DeleteMapping(value = "/user")
    public String deleteUser() {
        return "Delete the User";
    }

}
