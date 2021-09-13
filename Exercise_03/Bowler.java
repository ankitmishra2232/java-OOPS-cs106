package exercise_03;

import java.util.Scanner;

public class Bowler
{
	String name;
	int numOfGames,numOfOvers,Wickets,fiveWickets;
	float avgRunPerWicket;
	
	public Bowler() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of a Bowler :");
		String name =sc.nextLine();
		System.out.println("Enter Number of Games of that Bowler :");
		int numOfGames=sc.nextInt();
		System.out.println("Enter avg run per wicket of that Bowler :");
		float avgRunPerWicket=sc.nextFloat();
		System.out.println("Enter Number of Wickets taken by the Bowler :");
		int Wickets = sc.nextInt();
		System.out.println("Enter Number of times Five wickets taken by that Bowler :");
		int fiveWickets = sc.nextInt();
		System.out.println("Enter Number of Overs by Bowler :");
		int numOfOvers = sc.nextInt();
		System.out.printf("\nName of Bowler :\t"+name+
				"\nNumber of Games played by"+name+":\t"+numOfGames+
				"\nNumber of Average Run per Wicket of"+name+":\t"+avgRunPerWicket+
				"\nTotal Wickets by"+name+":\t"+Wickets+
				"\nNumber of times 5 wickets taken by"+name+":\t"+fiveWickets+
				"\nNumber of Overs by"+ name+":\t"+numOfOvers);
	}
}