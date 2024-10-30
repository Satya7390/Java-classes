public class ToString {
    int noOfWheels ;
    int noOfDoors;
    int maxSpeed;  
    String model;
    String carName;
    String company;



     // this is easly generated through the vs code 
     //extension source action -> Generate Constructor

    public ToString(int noOfWheels, int noOfDoors, int maxSpeed, String model, String carName, String company) { 

        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.carName = carName;
        this.company = company;
    }


    
     // this is easly generated through the vs code 
     //extension source action -> Generate toString()

    @Override
    public String toString() {
        return "My car name is : "+carName;
    }
    

    public static void main(String[] args) {
        ToString Swift = new ToString(4,2,120,"UP5735","Swift","Maruti");
        System.out.println(Swift);
              
    }

  
  }


//   Outputs : 

//   My car name is : Swift