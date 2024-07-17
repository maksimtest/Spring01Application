package org.abc.spring01.controller;

import org.abc.spring01.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AdminController {
    @GetMapping("/")
    public List<User> getUsers(){
        List<User> list = new ArrayList<>();
        list.add(new User("user1", "pass"));
        list.add(new User("user2", "pass"));
        return list;
    }
}
