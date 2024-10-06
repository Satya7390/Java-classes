// package 9 Instance and Variables;

public class Driver {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.addFuel(6);
        myCar.drive();
        System.out.println("Current Fuel is : " +myCar.getCurrentFuelLevel());
        myCar.drive();
        myCar.drive();
        System.out.println("Current Fuel is : " +myCar.getCurrentFuelLevel());
        myCar.addFuel(3);
        myCar.drive();
        System.out.println("Current Fuel is : " +myCar.getCurrentFuelLevel());
        myCar.drive();
        System.out.println("Current Fuel is : " +myCar.getCurrentFuelLevel());
    
    }
}

// Outputs =========

// Car is out of fuel
// Fuel is added successfully 6.0 liters Let's Drive a Car
// Driving a car
// Current Fuel is : 5.0
// Driving a car
// Car is in Reserved mode , please refuel
// Current Fuel is : 4.0
// Fuel is added successfully 3.0 liters Let's Drive a Car
// Driving a car
// Current Fuel is : 6.0
// Driving a car
// Current Fuel is : 5.0