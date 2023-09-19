package com.example.hw_3_3rv3;

public class Contacts {
    private String name;
    private String email;

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

    public Contacts(String name, String email) {
        this.name = name;
        this.email = email;
    }
}


