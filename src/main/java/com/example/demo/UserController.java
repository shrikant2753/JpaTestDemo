package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add-user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/get-user")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }

    @GetMapping("get-allUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
