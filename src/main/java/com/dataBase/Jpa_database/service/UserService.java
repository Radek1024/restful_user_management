package com.dataBase.Jpa_database.service;

import com.dataBase.Jpa_database.entity.User;
import com.dataBase.Jpa_database.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
public class UserService {

    public UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> listUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);

        return users.size() != 0 ? users : users;
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).get();
    }

    public void editUser(Integer id, User user) {
        User u = userRepository.findById(id).get();
        u.setName(user.getName());
        u.setLastName(user.getLastName());
        u.setCity(user.getCity());
        u.setAddress(user.getAddress());
        userRepository.save(u);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void addUser(String name, String lastName, String city, String address) {
        User user = new User(name, lastName, city, address);
        userRepository.save(user);
    }

}
