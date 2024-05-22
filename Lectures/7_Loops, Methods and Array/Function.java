public class Function {
    public static void main(String[] args) {
        System.out.println("\nIn Main method");
        greetUser();
        System.out.println("Method calling Completed");
        greetUser();
        
    }

    
    public static void greetUser() {
        System.out.println("Good Morning Satya!!");
        
    }
    
}


// output

// In Main method
// Good Morning Satya!!
// Method calling Completed
// Good Morning Satya!!