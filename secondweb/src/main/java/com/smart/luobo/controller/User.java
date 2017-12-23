package com.smart.luobo.controller;

public class User {
    private Integer id;
    private String name;
    private String email;

    public User(Integer id) {
        this.id = id;
    }

    public User() {
    }

    public User(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

