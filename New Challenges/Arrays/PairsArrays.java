public class PairsArrays {
    public static void main(String[] args) {
        System.out.println("Pairs of an Arrays!!");
        int num[] = { 2, 4, 6, 8, 10 };
        find_pairs(num);
    }

    public static void find_pairs(int nums[]) {
        int tp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + nums[i] + "," + nums[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total no of pairs is : " + tp);
    }
}

// Outputs:

// Pairs of an Arrays!!
// (2,4) (2,6) (2,8) (2,10)
// (4,6) (4,8) (4,10)
// (6,8) (6,10)
// (8,10)

// Total no of pairs is : 10