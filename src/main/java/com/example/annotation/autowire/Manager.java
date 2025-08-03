package com.example.annotation.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    @Autowired   // Field Autowiring
    private Employee emp;

//Constructor Autowiring
//    @Autowired
//    public Manager(Employee emp) {
//        this.emp = emp;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "emp=" + emp +
                '}';
    }
}
