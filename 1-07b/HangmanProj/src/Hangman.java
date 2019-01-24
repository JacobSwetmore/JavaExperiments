
import java.util.*;

public class Hangman {

    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        String inputWord;
        int attempts = 0;
        int lettersFound = 0;
        System.out.println("Please Enter a word to be guessed: ");
        inputWord = kybd.next();

        for (int i = 0; i < 20; i++) {
            System.out.println(" ");
            //this is to prevent the other player from seeing the inputted line.

        }
        
        System.out.println("Player 1 has inputted a word, please guess this word: Player 2.");

        int wordLength = inputWord.length();
        char blank[] = new char[wordLength];

        for (int i = 0; i < wordLength; i++) {
            blank[i] = '-';
        }

        while (lettersFound < wordLength) {
            System.out.print("Display: ");
            for (int i = 0; i < wordLength; i++) {
                System.out.print(blank[i]);
            }
            System.out.print(" Your Guess: ");

            char input = kybd.next().charAt(0);

            System.out.println("Letter guessed: " + input);

            for (int i = 0; i < wordLength; i++) {
                if (input == inputWord.charAt(i)) {
                    blank[i] = inputWord.charAt(i);
                    lettersFound++;
                }
            }

            attempts++;
        }
        System.out.println("Correct! The word was: " + inputWord);
        System.out.println("It took you " + attempts + " attempts to guess " + inputWord);

    }

}
