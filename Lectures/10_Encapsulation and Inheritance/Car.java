// package 10_Encapsulation and Inheritance.GetterSetter.OtherPackage;

public class Car {
    
    private  String color;  // public

    private String model;   // public

    private double fuelLevel;

    private  long costOfPurchase;   // default

    public  Car(String color, long costOfPurchase, double fuelLevel, String model) {
        this.color = color;
        this.costOfPurchase = costOfPurchase;
        this.fuelLevel = fuelLevel;
        this.model = model;
    }

    

    public String getColor (){
        return color;
    };

    public String getModel (){
        return color;
    };

    
    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public long getCostOfPurchase() {
        return costOfPurchase;
    }

    public void setCostOfPurchase(long costOfPurchase) {
        this.costOfPurchase = costOfPurchase;
    }
}
