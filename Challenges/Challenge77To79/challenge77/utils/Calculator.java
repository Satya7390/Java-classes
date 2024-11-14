package Challenge77To79.challenge77.utils;

import Challenge77To79.challenge77.geometry.Circle;
import Challenge77To79.challenge77.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10, 5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);

        int rectArea = rect.length * rect.width;

        System.out.printf("Area of the Circle is : %f\nArea of the Rectangle is : %d" , cirArea , rectArea);

    }
}


// Outputs : 

// Area of the Circle is : 95.033178
// Area of the Rectangle is : 50