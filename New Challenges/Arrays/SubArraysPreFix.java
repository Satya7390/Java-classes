
public class SubArraysPreFix {
    public static void main(String[] args) {
        System.out.println("\nPrinting SubArrays!!");
        int nums[] = { 1, -2, 6, -1, 3 };
        findPreFixSubArr(nums);
    }

    public static void findPreFixSubArr(int nums[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        // Calculating prefix

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }

        }
        System.out.println("Max of SubArrays is : " + maxSum);
    }
}
