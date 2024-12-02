package com.example.RealTimeTicketingsystem.service;

import com.example.RealTimeTicketingsystem.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User getUserById(Integer id);
    User getUserByUsername(String username);
    void deleteUser(Integer id);
}
