public class BreakAndContinue {
    public static void main(String[] args) {
        // useOfBreak();
        useOfContinue();
    }

    public static void useOfBreak() {
        System.out.println("Before the loop!!");
        for (int i = 1; i < 50; i++) {
            if (i == 11) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of the loop!!");
    }

    public static void useOfContinue() {
        System.out.println("Before the loop!!");
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of the loop!!");
    }
}

// Outputs: 
//=============using break==========
// Before the loop!!
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// Out of the loop!!

//=============using continue==========

// Before the loop!!
// 1
// 2
// 3
// 4
// 6
// 7
// 8
// 9
// Out of the loop!!