package exercise_03;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		System.out.println("Type\n (1)Batsman : \n(2)Bowler : \n(3)Batsman and Bowler both : \n");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 1: 
			
			System.out.println("\n please enter \n1. DEMO\n2. Self Entry\n");
			int j=sc.nextInt();
			switch(j) {
			case 1:
				String name;
				int numOfGames,numOfCenturies,fifties;
				float avgRun;
				
				
				name="Ankit";
				avgRun=45.6f;
				fifties=4;
				numOfCenturies=6;
				numOfGames=40;
				System.out.printf("\nName of Batsman :\t "+name+
						"\nNumber of Games played by "+name+" :\t"+numOfGames+
						"\nNumber of Centuries of "+name+" :\t"+numOfCenturies+
						"\nAverage Run Scored by "+name+" :\t"+avgRun+
						"\nNumber of Half Centuries of "+name+" :\t"+fifties);
				break;
				
			case 2 :
				System.out.println("Enter the Information of a Batsman");
				System.out.println("\n=====================================");
				BatsMan bat = new BatsMan();
				break;
			}
			break;
			
		case 2 :
			System.out.println("\n please enter \n1. DEMO\n2. Self Entry\n");
			int k=sc.nextInt();
			switch(k) {
			case 1 :
				String name;
				int numOfGames,numOfOvers,Wickets,fiveWickets;
				float avgRunPerWicket;
				
				name="Ankit";
				numOfGames=100;
				numOfOvers=356;
				Wickets=123;
				fiveWickets=10;
				avgRunPerWicket=23;
				
				System.out.printf("\nName of Bowler :\t"+name+
						"\nNumber of Games played by"+name+":\t"+numOfGames+
						"\nNumber of Average Run per Wicket of"+name+":\t"+avgRunPerWicket+
						"\nTotal Wickets by"+name+":\t"+Wickets+
						"\nNumber of times 5 wickets taken by"+name+":\t"+fiveWickets+
						"\nNumber of Overs by"+ name+":\t"+numOfOvers);
				break;
			case 2:
				System.out.println("Enter the Information of a Bowler");
				System.out.println("\n=====================================");
				Bowler b=new Bowler();
				break;
			}
			
			break;
			
		case 3 :
			System.out.println("\n please enter \n1. DEMO\n2. Self Entry\n");
			int l = sc.nextInt();
			switch(l) {
			case 1 :
				String nameBat,name;
				int numOfGames,numOfGamesbat,numOfOvers,Wickets,fiveWickets,numOfCenturies,fifties;
				float avgRunPerWicket,avgRun;
				
				nameBat="Ankit";
				name="Mogambo";
				avgRun=45.6f;
				fifties=4;
				numOfCenturies=6;
				numOfGamesbat=10;
				numOfGames=100;
				numOfOvers=356;
				Wickets=123;
				fiveWickets=10;
				avgRunPerWicket=23;
				System.out.printf("\nName of Batsman :\t "+nameBat+
						"\nNumber of Games played by "+nameBat+" :\t"+numOfGamesbat+
						"\nNumber of Centuries of "+nameBat+" :\t"+numOfCenturies+
						"\nAverage Run Scored by "+nameBat+" :\t"+avgRun+
						"\nNumber of Half Centuries of "+nameBat+" :\t"+fifties+"\n\n\nName of Bowler :\t"+name+
						"\nNumber of Games played by "+name+":\t"+numOfGames+
						"\nNumber of Average Run per Wicket of "+name+":\t"+avgRunPerWicket+
						"\nTotal Wickets by "+name+":\t"+Wickets+
						"\nNumber of times 5 wickets taken by "+name+":\t"+fiveWickets+
						"\nNumber of Overs by "+ name+":\t"+numOfOvers);
				break;
			case 2:
				System.out.println("Enter the Information of a BatsMan and a Bowler");
				System.out.println("\n================================================");
				BatsMan bman = new BatsMan();
				Bowler bo= new Bowler();
				
				break;
			}
			
			break;
		}
		
	}

}
