package car.example.autowire.byName;

public class Car {

    public void setSpecification1(Specification specification) {
        this.specification1 = specification;
    }

    private Specification specification1;


//    public Car(Specification specification){
//        this.specification = specification;
//    }

    public void toDisplayDetails(){
        System.out.println("Specification "+specification1);
    }
}
