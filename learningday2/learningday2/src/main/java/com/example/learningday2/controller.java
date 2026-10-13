package com.example.learningday2;

import org.springframework.web.bind.annotation.*;

@RestController
public class controller {

    @GetMapping("/api/users/{id}")
    public String users(@PathVariable int id){
        return  "the user is"+id;
    }

    //request parameter
    @GetMapping("/api/users")
    public String getusers(@RequestParam int id){
        return "the user is "+id;
    }

    @PostMapping("/api/hello")
    public String giveUser(){
        return "the post request is recieved";
    }

}
