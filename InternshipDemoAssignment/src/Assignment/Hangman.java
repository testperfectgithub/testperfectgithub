package Assignment;

import java.util.Scanner;

public class Hangman {
    private static String[] words = {"java", "python", "programming", "computer", "algorithm", "software"};
    private static String word;
    private static char[] progress;
    private static int attemptsLeft;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        chooseWord();
        initializeProgress();
        attemptsLeft = 6;

        while (attemptsLeft > 0 && !isWordGuessed()) {
            System.out.println("Attempts left: " + attemptsLeft);
            displayProgress();
            System.out.print("Enter a letter: ");
            char guess = scanner.next().charAt(0);
            checkGuess(guess);
        }

        if (isWordGuessed()) {
            System.out.println("Congratulations! You guessed the word: " + word);
        } else {
            System.out.println("Sorry, you ran out of attempts. The word was: " + word);
        }
    }

    private static void chooseWord() {
        word = words[(int) (Math.random() * words.length)];
    }

    private static void initializeProgress() {
        progress = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            progress[i] = '_';
        }
    }

    private static void displayProgress() {
        for (char letter : progress) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    private static boolean isWordGuessed() {
        for (char letter : progress) {
            if (letter == '_') {
                return false;
            }
        }
        return true;
    }

    private static void checkGuess(char guess) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                progress[i] = guess;
                found = true;
            }
        }
        if (!found) {
            attemptsLeft--;
            System.out.println("Incorrect guess.");
        }
    }
}