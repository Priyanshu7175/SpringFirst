package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyBean bean = (MyBean) context.getBean("Mybean");
        System.out.println(bean);

    }
}
