



// 73. Simulate a dice roll using Math.random() and display the outcome
// (1 to 6).

class DiceRoll {

    int roll() {

        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }

    public static void main(String[] args) {

        DiceRoll dice = new DiceRoll();

        for (int i = 1; i < 20; i++) {
            System.out.println(dice.roll());

        }

    }

}

// Outputs : 

// 1
// 1
// 4
// 1
// 4
// 1
// 4
// 6
// 6
// 6
// 3
// 6
// 1
// 5
// 3
// 1
// 5
// 6
// 2
