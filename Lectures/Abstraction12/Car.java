package Lectures.Abstraction12;

public class Car extends Vehicle {

    private int noOfDoors;

    public Car(int noOfTires) {
        super(4);  //
    }

    
    @Override
    public void  makeStartSound() {
        System.out.println("Car started......");  //define methods
    }
    
}
