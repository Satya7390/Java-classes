package Challenge77To79.challenge79;

public class TestEmployee {

    public static void main(String[] args) {
        Employee emp = new Employee("Satya", 20, 200000);

        System.out.println(emp.getEmployeeDetails());
        emp.setName("Satyanand Gupta");
        System.out.println(emp.getEmployeeDetails());
    }
}


// Outputs : 

// Employee Details : Name : Satya, Age : 20, Salary : 200000.0
// Employee Details : Name : Satyanand Gupta, Age : 20, Salary : 200000.0