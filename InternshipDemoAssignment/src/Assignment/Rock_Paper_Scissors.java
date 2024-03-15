package Assignment;

import java.util.Scanner;

public class Rock_Paper_Scissors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter Rock_Paper_Scissors.If You Want To Exist This Game");
			String mymovie=sc.nextLine();
			
			if(mymovie.equals("quit")) {
				break;
			}
	
			if(!mymovie.equals("rock")&&!mymovie.equals("paper")&&!mymovie.equals("scissors")) {
				System.out.println("Please Enter Valid Data");
			}
			else {
				int rand=(int)(Math.random()*3);
				String oppositemovie="";
				if(rand==0) {
					oppositemovie="rock";
			}
				else if(rand==1) {
					oppositemovie="paper";
				}
				else {
					oppositemovie="scissors";
				}
				System.out.println("OppositeMovie="+oppositemovie);
				if(mymovie.equals(oppositemovie)) {
					System.out.println("Match Tied");
				}
				
				else if((mymovie.equals("rock")&&oppositemovie.equals("scissors"))||(mymovie.equals("scissors")&&oppositemovie.equals("paper"))||(mymovie.equals("paper")&&oppositemovie.equals("rock"))){
					System.out.println("You WIn");
				}
				else {
					System.out.println("You Lose");
				}
			}
		}
		System.out.println("Thanks For Playing This Game:)");
	}
}
