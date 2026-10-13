package com.example.CRUD_operation_using_arraylist;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controller {
    ArrayList<User> users =new ArrayList<User>();

    @PostMapping("/api/users")
public List<User> createUser(@RequestBody User user)
{
    users.add(user);
    return users;
}

@GetMapping("/api/users")
public List<User> getALLUser()
{
    return users;
}

@GetMapping("/api/users/{Id}")
public User getUserById(@PathVariable int Id)
{
    for(User user:users)
    {
        if(user.getId()==Id)
        {
            return user;
        }
    }
    return null;
}
@PutMapping("/api/users/{id}")
public User updateuser(@PathVariable int id,@RequestBody User user)
{
    for(User user1:users)
    {
        if(user1.getId()==id)
        {
            user1.setName(user.getName());
            user1.setEmail(user.getEmail());
            return user1;
        }

    }
    return null;
}

@DeleteMapping("/api/users/{id}")
public User deleteuser(@PathVariable int id)
{
    for(User user2:users)
    {
        if(user2.getId()==id)
        {
         users.remove(user2)  ;
         return user2;
        }
    }
    return null;
}

}
