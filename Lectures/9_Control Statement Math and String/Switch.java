import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Day Checker!!");
        System.out.print("Please enter your day number : ");
        int day = input.nextInt();
        // oldSwitch(day);
        newSwitch(day);
    }

    // use of switch case ================
    public static void oldSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input!! , Please enter value between 1 to 7");
                break;
        }
    }

    // Using Advance version concepts of switch case============
    public static void newSwitch(int day) {
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid input!! , Please enter value between 1 to 7";
        };
        System.out.println(dayStr);
    }

}

// Outputs :

// Welcome to Day Checker!!
// Please enter your day number : 2
// Tuesday

// Welcome to Day Checker!!
// Please enter your day number : 8
// Invalid input!! , Please enter value between 1 to 7
