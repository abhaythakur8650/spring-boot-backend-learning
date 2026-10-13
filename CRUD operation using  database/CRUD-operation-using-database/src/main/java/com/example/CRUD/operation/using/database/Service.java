package com.example.CRUD.operation.using.database;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public User createuser(User user)
    {
        return repository.save(user);
    }

    public Optional<User> getuser(int id)
    {
       return  repository.findById(id);
    }

    public List<User> getallusers()
    {
        return repository.findAll();
    }

    public void deleteuser(int id)
    {
         repository.deleteById(id);
    }

    public void deleteall()
    {
        repository.deleteAll();
    }

    public User updateuser(int id,User user)
    {
User existinguser=repository.findById().orElseThrow(()-> new RuntimeException("user not found"));

 existinguser.setName(existinguser.getName());
 existinguser.setEmail(existinguser.getEmail());
 return repository.save(existinguser);
    }
}
