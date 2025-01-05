public class TwiceArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 4 };
        System.out.println(repeat_num(nums));
    }

    public static boolean repeat_num(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i + 1); j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
