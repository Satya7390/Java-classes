package Lectures.Inheritance11;

public class InheritanceTest {
    
   public static void main(String[] args) {

    Vehicle veh = new Vehicle();
    veh.commute();

    TwoWheeler two = new TwoWheeler();
    two.commute();
    two.balance();

    MotorCycle motor = new MotorCycle();
    motor.commute();
    motor.balance();
    motor.start();

    // object class
    System.out.println(motor.getClass());
    System.out.println(motor.toString());
    System.out.println(motor.hashCode());
    // System.out.println(motor.equals(4));
   
   }
}
