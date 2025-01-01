
public class SubArraysKadanes {
    public static void main(String[] args) {
        // int nums[] = { 1, -2, 6, -1, 3 };
        int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanesAlgo(nums); // this algo is easy approach with O(n) time complexity but if we have arr of
                           // all items in -ve the we have to find min of that arr
        // for all negative items
        int nums2[] = { -1, -2, -3, -5, -4 };
        forAllNegative(nums2);
    }

    public static void kadanesAlgo(int nums[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max of Subarrays is : " + maxSum);
    }

    public static void forAllNegative(int nums2[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums2.length; i++) {
            currSum = currSum + nums2[i];
            if (currSum > maxSum) { // this logic is valid for all -ve case
                maxSum = currSum;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max of Subarrays is : " + maxSum);
    }
}


// Outputs : 

// Max of Subarrays is : 7
// Max of Subarrays is : -1