package Assignment;

import java.util.Scanner;

public class PrintTikTacTok {
	public static void main(String[] args) {
		
	
	char [][] board=new char[3][3];
	for(int row=0;row<board.length;row++) {
		for(int col=0;col<board[row].length;col++) {
			board[row][col]=' ';
		}
	}
	char player='x';
	boolean gameover=false;
	Scanner sc=new Scanner(System.in);
	while(!gameover) {
		printBoard(board);
		System.out.println("Player"+ player + "Enter:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		System.out.println();
		if(board[row][col]==' ') {
			board[row][col]=player;
			gameover=haveWon(board,player);
		
		if(gameover) {
			System.out.println("Player"+ player + "Has Won" );
		}
		else if(gameover) {
			System.out.println("Player" + player + " Its Draw");
			
		}	
		else {
			player=(player=='X') ? 'O' : 'X';
		}
	}
	else {
		System.out.println("Invalid Data.Try Again!");
	}
		}
	printBoard(board);

	}


	private static boolean haveWon(char[][] board, char player) {
		// TODO Auto-generated method stub
		for(int row=0;row<board.length;row++) {
			if(board[row][0]==player && board[row][1]==player && board[row][2]==player) {
				return true;
			}
		}
		for(int col=0;col<board[0].length;col++) {
			if(board[col][0]==player && board[col][1]==player && board[col][2]==player) {
				
				return true;
				
			}

		}
		if(board[0][0]==player && board[1][1]==player && board[2][2]==player) {
			return true;
		}
		if(board[0][1]==player && board[1][1]==player && board[2][0]==player) {
			return true;
		}
		return false;
	}

	private static void printBoard(char[][] board) {
		// TODO Auto-generated method stub
		for(int row=0;row<board.length;row++) {
			for(int col=0;col<board[row].length;col++) {
				System.out.print(board[row][col]+" | ");
			}
			System.out.println();
		}
	}
}
