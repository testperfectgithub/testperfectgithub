package Assignment;

import java.util.Scanner;

public class InterestAmountForLoanAmount {
public static void main(String[] args) {
int interest;int loan ;int rateofinterest ;int timeperiod ;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Interest");
loan=sc.nextInt();
rateofinterest=sc.nextInt();
timeperiod=sc.nextInt();
interest=loan*rateofinterest*timeperiod/100;
System.out.println("Interest="+interest);
}
}
