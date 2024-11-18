package Lectures.Inheritance11;

public class TwoWheeler extends  Vehicle {

    TwoWheeler(){
        setNoOfTires(2);
        // noOfTires = 4;
    }

    public  void balance(){
        System.out.println("I am balancing on two tires");
    }

}
