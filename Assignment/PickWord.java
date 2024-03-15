package Assignment;

import java.util.Scanner;

public class PickWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Value");
	String str=sc.nextLine().trim();
	str=str+" ";
	String str1="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(Character.isWhitespace(ch)) {
			System.out.println(str1.charAt(0));
			str1="";
		}
		else {
			str1=str1+ch;
		}
	}
}
}
