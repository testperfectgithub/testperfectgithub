package Assignment;

import java.util.Scanner;

public class SpeedOfTheVehicleEWithDistanceAndTime {
	public static void main(String[] args) {
		int speed;
		int distance;
		int time;
		int speed1;
		int distance1;
		int time1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Speed");
//		speed = sc.nextInt();
		distance = sc.nextInt();
		time = sc.nextInt();
//		speed1 = sc.nextInt();
		distance1 = sc.nextInt();
		time1 = sc.nextInt();
		speed = distance / time;
		System.out.println("Speed=" + speed);
		speed1 = distance / time1;
		System.out.println("Speed1=" + speed1);
		speed = speed - speed1;
		System.out.println("Speed=" + speed);
	}
}
