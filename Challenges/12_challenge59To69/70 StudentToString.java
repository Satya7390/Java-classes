
// 70. Define a Student class with fields like name and age, and use
// toString to print student details.

 class  StudentToString {
    String name;
    int age ; 
    String rollNumber ;
    String house;


    // Constructor generated
    public StudentToString(int age, String house, String name, String rollNumber) {
        this.age = age;
        this.house = house;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString(){
      return "Student Details:{name: " + name
           +", age: " + age
           + ",roll number: " + rollNumber
           + ", house: " + house + " }";

    }
    
    
    public static void main(String[] args) {
        StudentToString Stu = new StudentToString(20, "ShivaHostel", "Satya", "0051") ;
        System.out.println(Stu);
    }
}


// Outputs : 

// Student Details:{name: Satya, age: 20,roll number: 0051, house: ShivaHostel }