package Assignment;

import java.util.Scanner;

public class DrawAGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter The Value.If You Exist This Game ");
			String mymovie=sc.nextLine();
			
			if(mymovie.equals("quit")) {
				break;
			}
			if(!mymovie.equals("rock")&& !mymovie.equals("paper")&& !mymovie.equals("scissors")) {
				System.out.println("Please Enter Right Value");
			}
			else {
				int rand=(int)(Math.random()*3);
				String opponentmovie="";
				if(rand==0) {
					opponentmovie="rock";
				}
				else if(rand==1) {
					opponentmovie="paper";
				}
				else {
					opponentmovie="scissors";
				}
				System.out.println("OpponentMovie="+opponentmovie);
				if(mymovie.equals(opponentmovie)){
					System.out.println("The Game Is Draw");
				}
			}
			
		}
		System.out.println("Thanks For Playing This Game!:)");
	}

}
