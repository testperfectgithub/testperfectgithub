package Assignment;

import java.util.Scanner;

public class PrintNameAndAge {
public static void main(String[] args) {
	String name;int age;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Your Name");
name=sc.next();
System.out.println("Enter Yhe Your Age");
age=sc.nextInt();
System.out.println("Name="+name);
System.out.println("Age="+age);
}
}
