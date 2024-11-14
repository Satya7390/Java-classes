
import java.util.Scanner;

// 74. Create a number guessing game where the program selects a random number, and the user has to guess it.
class GuessingGame {

    int random;

    GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }


    /*
    * guessNumber the number that player guessed
    * @return 
    * negative if the guessnumber is smaller
    * 0 if the guessNumber is correct
    * positive if the guessNumber is higher
     */
    int Guess(int guessNumber) {

        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();

        System.out.println("Welcome to the Guessing Game!! Guess the number between 1-100");
        int Guess;
        int result;

        do {
            System.out.print("Guess the Number :  ");
            Guess = input.nextInt();
            result = game.Guess(Guess);
            if (result == 0) {
                System.out.println("Congrats!! You Guess was Correct");
            } else if (result < 0) {
                System.out.println("Guess the Higher Number!!");

            } else {
                System.out.println("Guess the Small Number!!");
            }

        } while (result != 0);

    }
}

// Outputs : 
// Welcome to the Guessing Game!! Guess the number between 1-100
// Guess the Number :  5
// Guess the Higher Number!!
// Guess the Number :  54
// Guess the Higher Number!!
// Guess the Number :  70
// Guess the Higher Number!!
// Guess the Number :  90
// Guess the Small Number!!
// Guess the Number :  80
// Guess the Higher Number!!
// Guess the Number :  85
// Guess the Small Number!!
// Guess the Number :  82
// Congrats!! You Guess was Correct
