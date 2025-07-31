package com.example.annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

//        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationComponentScan.xml");
//
//        Employee emp =context.getBean("employee", Employee.class);
//        System.out.println(emp.toString());

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp =context.getBean("employee", Employee.class);
        System.out.println(emp.toString());

        Manager manager = context.getBean("manager", Manager.class);
        System.out.println(manager.toString());


    }
}
