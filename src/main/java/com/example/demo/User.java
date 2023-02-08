package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//So that hibernate can identify whose attributes to take for table creation
@Table(name = "user")//for giving table name, by default==class name
public class User {
    @Id//it is written on that attribute which has to become primary key
    private int id;
    private String name;
    private int age;
    private String mobileNo;

    public User(){}

    public User(int id, String name, int age, String mobileNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
