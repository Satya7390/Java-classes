public class RiverseArray {
    public static void main(String[] args) {
        System.out.println("Riverse In descending order of an Array!!");
        int nums[] = { 2, 4, 6, 8, 10, 12 };
        riverseOfArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void riverseOfArray(int nums[]) {
        int first = 0, last = nums.length - 1;
        while (first < last) {
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }
    }
}


// Outputs : 

// Riverse In descending order of an Array!!
// 12 10 8 6 4 2 