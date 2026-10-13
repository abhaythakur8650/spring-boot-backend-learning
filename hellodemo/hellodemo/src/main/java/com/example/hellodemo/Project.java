package com.example.hellodemo;

public class Project {
    private String name;
    private String technology;
    private String status;

    public Project (String name, String technology, String status) {
        this.name = name;
        this.technology = technology;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getTechnology(){
            return technology;
        }

        public String getStatus() {
            return status;
        }
    }

