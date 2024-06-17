
// 41. Create a program to find number of occurrences of an element in an array.

import java.util.Scanner;

class NumberOfOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wlecome to find number of occurrences in the Array!!");

        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Now , Please enter your number which you want to find number of occurrences : ");
        int num = input.nextInt();
        int occurrences = numberOfOccurences(numArray, num);
        System.out.println("Number "+num+" is found " + occurrences + " time in the Array");
    }

    public static int numberOfOccurences(int[] numArray, int num) {
        int i = 0;
        int count = 0;
        while (i < numArray.length) {

            if (num == numArray[i]) {
                count++;
            }
            i++;
        }
        return count;

    }

}


// Outputs : 
// Wlecome to find number of occurrences in the Array!!
// Please enter the number of elements : 4
// Please enter element number 1: 3453
// Please enter element number 2: 66
// Please enter element number 3: 88
// Please enter element number 4: 66
// Now , Please enter your number which you want to find number of occurrences : 66
// Number 66 is found 2 time in the Array