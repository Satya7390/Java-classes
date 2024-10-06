// package 9 Instance and Variables; 

// Declaration of car's properties
public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    // Declaration of car's methods

    public void drive() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in Reserved mode , please refuel");
        } else {
            System.out.println("Driving a car");
            currentFuelInLiters--;
        }

    }

    public void addFuel(float fuel) {
        currentFuelInLiters += fuel;
        System.out.println("Fuel is added successfully " + fuel + " liters Let's Drive a Car");
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

}
