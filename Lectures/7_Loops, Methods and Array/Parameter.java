public class Parameter {

    public static void main(String[] args) {
        
       int sum = twoNumber(10, 20); // passing Arguments
        System.out.println(sum);

        System.out.println(twoNumber(12, 12));  
    }

    public static int twoNumber(int a , int b) {
        System.out.println("First Number Received : "+a);
        System.out.println("First Number Received : "+b);

        return a+b;
        
    }
    
}
