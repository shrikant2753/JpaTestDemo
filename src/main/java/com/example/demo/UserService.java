package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        try{
            userRepository.save(user);
            return "User added Successfully";
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "Unable to create user";
    }

    public User getUser(int id){
        return userRepository.findById(id).get();
    }

    public List<User> getAllUser(){
        List<User> allUser = userRepository.findAll();
        return allUser;
    }
}
