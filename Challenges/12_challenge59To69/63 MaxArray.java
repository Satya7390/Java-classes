
// 63. Create a program using for-each to find the maximum value in an integer array.

class MaxArray {
    public static void main(String[] args) {
        System.out.println("Welcome to finding the maximum from the Array !!");
        int[] arr = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("your max value is : " + max);
    }
}

// Outputs :

// Welcome to finding the maximum from the Array !!
// Please enter the number of elements : 4
// Please enter element number 1: 0
// Please enter element number 2: 5
// Please enter element number 3: 3
// Please enter element number 4: 2
// your max value is : 5