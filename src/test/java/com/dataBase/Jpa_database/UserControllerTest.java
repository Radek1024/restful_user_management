package com.dataBase.Jpa_database;

import com.dataBase.Jpa_database.controller.UserController;
import com.dataBase.Jpa_database.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserControllerTest {

    // test is gonna fail because of in proper instantiation of UserController
    @Test
    public void testUserController(){
        UserController userController = new UserController();
        User user = userController.getUserById(3);
        Assertions.assertEquals(3,user.getId());
    }
}
