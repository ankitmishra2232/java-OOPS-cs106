package exercise_03;

import java.util.Scanner;

public class BatsMan
{
	String name;
	int numOfGames,numOfCenturies,fifties;
	float avgRun;
	
	
	public BatsMan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of a Batsman :");
		String name =sc.nextLine();
		System.out.println("Enter Number of Games of that Batsman :");
		int numOfGames=sc.nextInt();
		System.out.println("Enter avg run of that Batsman :");
		float avgRun=sc.nextFloat();
		System.out.println("Enter Number of centuries of that Batsman :");
		int numOfCenturies = sc.nextInt();
		System.out.println("Enter Number of Fifties of that Batsman :");
		int fifties = sc.nextInt();
		System.out.printf("\nName of Batsman :\t "+name+
				"\nNumber of Games played by "+name+" :\t"+numOfGames+
				"\nNumber of Centuries of "+name+" :\t"+numOfCenturies+
				"\nAverage Run Scored by "+name+" :\t"+avgRun+
				"\nNumber of Half Centuries of "+name+" :\t"+fifties);
	}
}