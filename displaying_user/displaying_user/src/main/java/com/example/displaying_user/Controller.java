package com.example.displaying_user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("api/Users")
    public List<Users> users() {
        List<Users> userList = List.of(
                new Users(1, "Abhay"),
                new Users(2, "Karim")
        );
        return userList;
    }
}

