package com.example.CRUD.operation.using.database;

import com.example.CRUD.operation.using.database.DTO.userDTO;
import com.example.CRUD.operation.using.database.exceptions.Usernotfoundexception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;
import java.util.Optional;



@org.springframework.stereotype.Service
public class Service {
    final private Logger logger= LoggerFactory.getLogger(Service.class);

    final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public User createuser(User user)
    {
        return repository.save(user);
    }

    public User getuser(int id)
    {
       return  repository.findById(id).orElseThrow(() -> new Usernotfoundexception("User not found with this ID "+ id)) ;
    }

    public List<User> getallusers()
    {
        logger.info("fetching the users from database");
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
User existinguser=repository.findById(id).orElseThrow(()-> new RuntimeException("user not found"));

 existinguser.setName(user.getName());
 existinguser.setEmail(user.getEmail());
   return repository.save(existinguser);
    }

    public User convertToEntity( userDTO dto)
    {
        User user =new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        return user;
    }
    public userDTO converttoDTO(User user)
    {
        return new userDTO(user.getId(),
        user.getName(),
        user.getEmail());

    }


}
