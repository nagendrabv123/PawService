package com.pawUser.PawUser.controller;

import com.pawUser.PawUser.model.Paw;
import com.pawUser.PawUser.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public interface UserController {

    @GetMapping("/getAllUsers")
    List<User> getAllUsers();

    @PostMapping("/addUser")
    User addUser(@RequestBody User user);

    @GetMapping("/getUserById/{userId}")
    Optional<User> getUserById(@PathVariable int userId);

    @GetMapping("/getAllPaws")
    List<Paw> getAllPaws();

}
