package Assignment;

import java.util.Scanner;

public class PrintVowelOrConsonantNumbers {
public static void main(String[] args) {
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Value");
	ch=sc.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.println("This Is Vowel Numbers="+ch);
	}
	else {
		System.out.println("This Is Consonant Numbers="+ch);
	}
}
}
