package com.example.RealTimeTicketingsystem.service.impl;

import com.example.RealTimeTicketingsystem.model.User;
import com.example.RealTimeTicketingsystem.repository.UserRepository;
import com.example.RealTimeTicketingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer id){
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User getUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
}
