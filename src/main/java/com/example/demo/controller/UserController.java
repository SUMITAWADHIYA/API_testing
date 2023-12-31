package com.example.demo.controller;


import com.example.demo.dto.UserRequest;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController{
    @Autowired
    private UserService service;


    @PostMapping("/signup")
    public User saveUser(@RequestBody UserRequest userRequest){
        return new ResponseEntity<>(service.saveUser(userRequest),HttpStatus.CREATED).getBody();
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(service.getAllUsers());

    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id){
        return ResponseEntity.ok(service.getUser(id));
    }
}
