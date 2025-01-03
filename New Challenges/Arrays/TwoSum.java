import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2,5,7,11};
        int target = 9;

    }

    public static int[] twoSum(int[] nums, int target) {
        // Use a HashMap to store the difference and the index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store the current number and its index in the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found (not expected per problem
        // constraints)
        return new int[] {};
    }
}
