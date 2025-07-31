package car.example.autowire.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByName.xml");
        Car myCar = (Car) context.getBean("MyCar");
        myCar.toDisplayDetails();

    }
}
