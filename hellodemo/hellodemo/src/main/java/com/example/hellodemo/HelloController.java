package com.example.hellodemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("api/project")
    public  Project project() {
        return new Project("Backend Learning Project","Java SpringBoot","learning");
    }
}
