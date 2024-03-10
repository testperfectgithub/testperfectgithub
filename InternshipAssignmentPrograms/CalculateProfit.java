package Assignment;

import java.util.Scanner;

public class CalculateProfit {
public static void main(String[] args) {
	int profit;int costprice;int sellingprice;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Profit Value");
	costprice=sc.nextInt();
	sellingprice=sc.nextInt();
	profit=sellingprice-costprice;
	System.out.println("Price="+profit);
	
}
}
