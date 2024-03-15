package Assignment;

import java.util.Scanner;

public class Hangman1 {
private static String [] words= {"Govind", "Sathyavathi", "Kalidas", "Balaram"};
private static String  word;
private static char[] progress;
private static int attemptLeft;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	chooseWord();
	inilizationProgress();
	attemptLeft=4;
	
	while(attemptLeft>0 && !isWordGuess()) {
		System.out.println("AttempLeft="+attemptLeft);
		displayWord();
		System.out.println("Enter The Value");
		char guess=sc.next().charAt(0);
		checkGuess(guess);
	}
	if(isWordGuess()) {
		System.out.println("Congratulations="+word);
	}
	else {
		System.out.println("Not"+word);
	}
}
private static void chooseWord() {
	// TODO Auto-generated method stub
	word=words[(int)(Math.random()*words.length)];
}
private static void inilizationProgress() {
	// TODO Auto-generated method stub
	progress =new char[word.length()];
	for(int i=0;i<word.length();i++) {
		progress[i]='_';
	}
}
private static boolean isWordGuess() {
	// TODO Auto-generated method stub
	for(char letter:progress) {
		if(letter=='_') {
			return false;
		}
	}
	return true;
}
private static void displayWord() {
	// TODO Auto-generated method stub
	for(char letter:progress) {
		System.out.print(letter+" ");
	}
	System.out.println();
}
private static void checkGuess(char guess) {
	// TODO Auto-generated method stub
	boolean found=false;
	for(int i=0;i<word.length();i++) {
		if(word.charAt(i)==guess) {
			progress[i]=guess;
			found=true;
		}
	}
	if(!found) {
		attemptLeft--;
		System.out.println("Game Over");
		
	}
}
}
