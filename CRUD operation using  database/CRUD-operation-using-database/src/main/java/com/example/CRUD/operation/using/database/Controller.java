package com.example.CRUD.operation.using.database;

import com.example.CRUD.operation.using.database.DTO.userDTO;

import jakarta.validation.Valid;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    private final Service service;
    private final Logger logger= LoggerFactory.getLogger(Controller.class);

    public Controller(Service service)
    {
        this.service=service;
    }


    @PostMapping("/api/users")
    public User saveUser(@Valid @RequestBody userDTO userd)
    {
        User user=service.convertToEntity(userd);
        return  service.createuser(user);
    }

    @GetMapping("/api/users")
    public List<User> getallUser()
    {
        logger.info("fetching all users");
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
    public User getById(@PathVariable int id)
    {
      logger.debug("fetching a user with id:"+id);
       return service.getuser(id);
    }

    @DeleteMapping("/api/users")
    public void DEleteall()
    {

       service.deleteall();
    }





    }
