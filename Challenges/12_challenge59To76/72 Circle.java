
import java.util.Scanner;

// 72. Calculate the area and circumference of a circle for a given radius
// using Math.PI
class Circle {

    double radiusInMm;

    Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getCirumference() {
        return 2 * Math.PI * radiusInMm;
    }

    double getArea() {
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
        return "Circle Props : Radius on mm : " + radiusInMm
                + " Circumference in mm : " + getCirumference() + " Area in mm2 : " + getArea();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of Circle !!\n");
        System.out.print("Now enter your radius : ");

        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);

    }
}

// Outputs : 

// Welcome to the world of Circle !!

// Now enter your radius : 5
// Circle Props : Radius on mm : 5.0 Circumference in mm : 31.41592653589793 Area in mm2 : 78.53981633974483