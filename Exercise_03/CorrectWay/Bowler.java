package lolo;

public class Bowler {
	String name;
	int numOfGamesPlayed, numOfOvers, Wickets, fiveWickets;
	float avgRunPerWicket;
	
	Bowler(){
		
	}
	
	
	Bowler(String name,int numOfGames,int numOfOvers,int Wickets, int fiveWickets, float avgRunPerWicket){
		this.name = name;
		this.numOfGames  = numOfGames;
		this.numOfOvers = numOfOvers;
		this.Wickets = Wickets;
		this.fiveWickets = fiveWickets;
		this.avgRunPerWicket = avgRunPerWicket;
	}
	
	void Results(){
		System.out.printf("\nName of Bowler :\t"+name+
				"\nNumber of Games played by"+name+":\t"+numOfGames+
				"\nNumber of Average Run per Wicket of"+name+":\t"+avgRunPerWicket+
				"\nTotal Wickets by"+name+":\t"+Wickets+
				"\nNumber of times 5 wickets taken by"+name+":\t"+fiveWickets+
				"\nNumber of Overs by"+ name+":\t"+numOfOvers);
	}

}
