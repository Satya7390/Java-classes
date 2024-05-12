
// 11.Create a program to calculate the Area of a Triangle. Area of triangle = ½*B*H

import java.util.Scanner;

class  TriangleArea {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelocome to find area of a triangle!!\n");

        System.out.print("Please enter base and height of your triangle : ");
        double B=input.nextDouble();
        double H=input.nextDouble();

        double area= .5*(B*H);

        System.out.println("Area of a Triangle is : "+area+"cm2");

    }
    
}
