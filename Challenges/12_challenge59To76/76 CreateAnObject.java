
// 76. Create an object with final fields and a constructor to initialize
// them.
class CreateAnObject {

    final int noOfWheels;
    final int noOfDoors;
    final String model;
    final String engineInLiters;

    public CreateAnObject(String engineInLiters, String model, int noOfDoors, int noOfWheels) {
        this.engineInLiters = engineInLiters;
        this.model = model;
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
    }

}
