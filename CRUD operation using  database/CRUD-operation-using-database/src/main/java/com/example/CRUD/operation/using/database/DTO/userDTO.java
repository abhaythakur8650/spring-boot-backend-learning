package com.example.CRUD.operation.using.database.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class userDTO {
    private int Id;

    @NotBlank(message ="name cannot be empty")
    @Size(max = 30,min = 3)
    private String name;

    @NotBlank(message = "email cannot be blank")
    @Email(message = "enter a valid mail")
    private String email;

    public userDTO(){

    }
    public userDTO(int Id, String name, String email)
    {
        this.Id= Id;
        this.name=name;
        this.email=email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
