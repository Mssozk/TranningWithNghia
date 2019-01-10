package org.java.demo.controller;

import org.java.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.java.demo.service.UserService;
import java.lang.Exception;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private  UserService userService;

    @PostMapping(name = "/")
    public void createUser(@RequestBody User user) {
        System.out.println(user);
        userService.createUser(user);
    }

    @PutMapping
    public String updateUser(@RequestBody User user) {
        System.out.println(user);
        userService.updateUser(user);
        return "User updated";
    }

    @DeleteMapping
    public String deleteUser(@RequestBody int id) {
        userService.deleteUserById(id);
        return  "User deleted";
    }

    @GetMapping
    public User findUser(@RequestBody int id) {
    User value = null;
    try {
        value = userService.findUserById(id);
        System.out.println("\nUser found");
    } catch ( Exception e) {
        System.out.println("\nInvalid ");
        value = new User();
    }
    return value;
    }
}
