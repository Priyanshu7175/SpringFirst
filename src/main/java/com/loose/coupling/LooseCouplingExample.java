package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLT.xml");


        UserManager userManagerWithDB = (UserManager) context.getBean("user1");
        System.out.println(userManagerWithDB.getUserInfo());
        UserManager userManagerWithWS = (UserManager) context.getBean("user2");
        System.out.println(userManagerWithWS.getUserInfo());
        UserManager userManagerWithNewDB = (UserManager) context.getBean("user3");
        System.out.println(userManagerWithNewDB.getUserInfo());

//        UserDataProvider databaseProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDB = new UserManager(databaseProvider);
//        System.out.println(userManagerWithDB.getUserInfo());
//
//        UserDataProvider webServiceProvider = new WebServiceDataProvider();
//        UserManager userManagerWithWS = new UserManager(webServiceProvider);
//        System.out.println(userManagerWithWS.getUserInfo());
//
//        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
//        UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
//        System.out.println(userManagerWithNewDB.getUserInfo());


    }
}
