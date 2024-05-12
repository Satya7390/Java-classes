// 14.Create a program to convert Fahrenheit to Celsius °C = (°F - 32) x 5/9

import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to Temperature Converter \n");

        System.out.print("please enter your Temperature in Fahrenheit value : ");
        float Ft = input.nextFloat();

        Float Cel = (Ft - 32)*5f/9f;
        System.out.println("Your  Temperature is : "+Cel+"C");
    }
    
}
