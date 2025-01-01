public class SubArrays {
    public static void main(String[] args) {
        System.out.println("\nPrinting SubArrays!!");
        int nums[] = { 1, -2, 6, -1, 3 };
        print_subarrays(nums);
    }

    public static void print_subarrays(int nums[]) {
        int tSubArr = 0;
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print("|" + nums[k]);
                    currSum += nums[k];
                }
                System.out.println(currSum); // Printing sum of SubArays
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

                tSubArr++;
                // System.out.print("|");
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no of SubArrays is : " + tSubArr);
        System.out.println("Max of SubArrays is :  " + maxSum);
    }
}

// Outputs :

// Printing SubArrays!!
// |2|
// |2|4|
// |2|4|6|
// |2|4|6|8|
// |2|4|6|8|10|

// |4|
// |4|6|
// |4|6|8|
// |4|6|8|10|

// |6|
// |6|8|
// |6|8|10|

// |8|
// |8|10|

// |10|