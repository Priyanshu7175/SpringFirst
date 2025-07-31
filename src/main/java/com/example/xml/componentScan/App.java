package com.example.xml.componentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationComponentScan.xml");

        Employee emp =context.getBean("employee",Employee.class);
        System.out.println(emp.toString());

    }
}
