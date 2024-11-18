package Lectures.Inheritance11;

public class Vehicle {
    
    private int noOfTires;

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    
    public void commute() {
        System.out.printf("I am going from A place to B using %d tires \n" , noOfTires);
    }

}
