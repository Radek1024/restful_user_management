package com.dataBase.Jpa_database.controller;

import com.dataBase.Jpa_database.entity.User;
import com.dataBase.Jpa_database.service.UserService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@NoArgsConstructor
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> listUsers(){
        return userService.listUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id){
       return userService.getUserById(id);
    }

    @PostMapping
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "Added " + user;
    }

    @PostMapping("/{name}/{lastName}/{city}/{address}")
    public String addUser(@PathVariable("name") String uName, @PathVariable String lastName,
                        @PathVariable String city, @PathVariable String address){
        userService.addUser(uName, lastName, city, address);
        return "Added user: " + uName + " " + lastName + " " + city + " " + address;
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Integer id,@RequestBody User user){
        userService.editUser(id, user);
        return "Updated user: " + user;

    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return "Deleted user id " + id ;
    }
}
