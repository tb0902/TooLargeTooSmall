import java.util.Random;
import java.util.Scanner;

public class GuessingGame {


    public boolean startGame() {
        Scanner entry = new Scanner(System.in);
        System.out.println("In this game, you'll be asked to guess a number from 1-10. Type 'Start' to Start." );
        String entryInput = entry.nextLine();

        if (entryInput.equals("Start")) {
            return true;
        }
        else {
            return false;
        }

    }
    public void runGame() {
        System.out.println("If you input a number, I will tell you if it is too small or too large.");
        int[] numberBank = {1,2,3,4,5,6,7,8,9,10};
        Scanner guessedNumber = new Scanner(System.in);

        while (startGame() == true) {
            Random random = new Random();
            int numberToGuess = random.nextInt(numberBank.length-1);

            if (guessedNumber.nextInt() < numberToGuess) {
                System.out.println("Too small.");
            }
            else if (guessedNumber.nextInt() < numberToGuess) {
                System.out.println("Too large.");
            }
            else {
                System.out.println("You win!");
            }
        }
    }
}
