package Assignment;

import java.util.Scanner;

public class PrintSeniorCitizenAge {
public static void main(String[] args) {
	int age;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Senor Citizen Age");
	age=sc.nextInt();
	if(age>60 && age<80) {
		System.out.println("This Is Senior Citizen Age ="+age);
	}
	else {
		System.out.println("This Is Not Senior Citizen Age Is="+age);
	}
}
}
