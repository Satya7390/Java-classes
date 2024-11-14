
// 66. Create a program using continue to sum all positive numbers entered by the
// user; skip any negative numbers.

class SumOfPositive {
    public static void main(String[] args) {
        System.out.println("Welcome to the sum of all positive numbers !!");

        int[] arr = ArrayUtility.inputArray();

        int sum = 0;
        for (int arrList : arr) {
            if (arrList < 0) {
                continue;
            }
            sum += arrList;
        }
        System.out.println("The sum of Positive numbers is : " + sum);
    }
}

// Outputs :

// Welcome to the sum of all positive numbers !!
// Please enter the number of elements : 5
// Please enter element number 1: -1
// Please enter element number 2: -2
// Please enter element number 3: 2
// Please enter element number 4: 4
// Please enter element number 5: 4
// The sum of Positive numbers is : 10

