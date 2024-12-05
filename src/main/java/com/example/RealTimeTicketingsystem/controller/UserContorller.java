package com.example.RealTimeTicketingsystem.controller;

import com.example.RealTimeTicketingsystem.model.User;
import com.example.RealTimeTicketingsystem.repository.UserRepository;
import com.example.RealTimeTicketingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UserContorller {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createuser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }
}
