package car.example.autowire.byType;

public class Car {

    public void setSpecification1(Specification specification) {
        this.specification = specification;
    }

    private Specification specification;


//    public Car(Specification specification){
//        this.specification = specification;
//    }

    public void toDisplayDetails(){
        System.out.println("Specification "+specification);
    }
}
