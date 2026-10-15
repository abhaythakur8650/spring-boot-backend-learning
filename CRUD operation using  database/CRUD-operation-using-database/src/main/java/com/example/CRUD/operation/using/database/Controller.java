package com.example.CRUD.operation.using.database;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    private final Service service;

    public Controller(Service service)
    {
        this.service=service;
    }

    @PostMapping("/api/users")
    public User saveUser(@RequestBody User user)
    {
        return  service.createuser(user);

    }

    @GetMapping("/api/users")
    public List<User> getallUser()
    {
        return service.getallusers();
    }

    @PutMapping("/api/users/{id}")
    public User updateUser(@PathVariable int id,@RequestBody User user)
    {

        return service.updateuser(id,user);
    }

    @DeleteMapping("/api/users/{id}")
    public  void deleteUser(@PathVariable int id) {
         service.deleteuser(id);
    }

    @GetMapping("/api/users/{id}")
    public Optional<User> getById(@PathVariable int id)
    {

       return service.getuser(id);
    }

    @DeleteMapping("/api/users")
    public void DEleteall()
    {

       service.deleteall();
    }




    }
