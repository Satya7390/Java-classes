public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary searching code!!");
        int nums[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;
        int index = find_binkey(nums, key);
        if (index == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item found at index : " + index);
        }

    }

    public static int find_binkey(int nums[], int key) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == key) {
                return mid;
            }
            if (nums[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
