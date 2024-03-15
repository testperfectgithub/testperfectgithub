package Assignment;



import java.util.Scanner;

public class StringIsAPalindromeOrNot {
public static void main(String[] args) {
	String str;String rev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Palidrome Number");
	str=sc.nextLine();
	int len=str.length();
	for(int i=len-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	if(str.equalsIgnoreCase(rev)) {
		System.out.println("This Is Palindrome Number="+str);
	}
	else {
		System.out.println("This Is Not Palindrome Number="+str);
	}
}
}
