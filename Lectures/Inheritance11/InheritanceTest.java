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
   }
}
