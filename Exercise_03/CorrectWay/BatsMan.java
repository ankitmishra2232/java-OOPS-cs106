package lolo;

public class BatsMan {
	
	String name;
	int numOfGames, numOfCenturies, fifties;
	float avgRun;
	
	BatsMan(){
		
	}
	
	BatsMan(String name,int numOfGames,int numOfCenturies, int fifties, float avgRun){
		this.name = name;
		this.numOfGames  = numOfGames;
		this.numOfCenturies = numOfCenturies;
		this.fifties = fifties;
		this.avgRun = avgRun;
	}
	
	void Results(){
		System.out.printf("\nName of Batsman :\t "+name+
				"\nNumber of Games played by "+name+" :\t"+numOfGames+
				"\nNumber of Centuries of "+name+" :\t"+numOfCenturies+
				"\nAverage Run Scored by "+name+" :\t"+avgRun+
				"\nNumber of Half Centuries of "+name+" :\t"+fifties);
	}
}
