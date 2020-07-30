package com.dataBase.Jpa_database;

import com.dataBase.Jpa_database.controller.UserController;
import com.dataBase.Jpa_database.entity.User;
import com.dataBase.Jpa_database.repository.UserRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MockitoUserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetUserById() {
        User u = new User();
        u.setId(1);
        User user = new UserController().getUserById(1);
        Assertions.assertEquals(u,user);
    }
}
