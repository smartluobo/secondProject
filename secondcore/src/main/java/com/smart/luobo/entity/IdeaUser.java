package com.smart.luobo.entity;

import java.io.Serializable;

public class IdeaUser implements Serializable{
    private Integer id;

    private String name;

    private String password;

    private String email;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public IdeaUser(String name, String password, String email, String address) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public IdeaUser() {

    }

    @Override
    public String toString() {
        return "IdeaUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}