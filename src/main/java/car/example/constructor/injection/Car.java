package car.example.constructor.injection;

public class Car {

    private Specification specification;

    public Car(Specification specification){
        this.specification = specification;
    }

    public void toDisplayDetails(){
        System.out.println("Specification "+specification);
    }
}
