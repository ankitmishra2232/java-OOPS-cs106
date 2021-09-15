package lolo;

public class Client {
public static void main(String[] args) {
		
		
		
		
		BatsMan bat[] = {new BatsMan("Ankit", 50, 2, 3, 51.2f)};
		
		Bowler ball[] = {new Bowler("mogambo", 150, 240, 94, 5, 22.7f)};
		
		printAll(bat, ball);
	}
	
	static void printAll(BatsMan bat[], Bowler ball[]) {
		for(int i = 0; i < bat.length; i++) {
			bat[i].Results();
		}
		
		for(int i = 0; i < ball.length; i++) {
			ball[i].Results();
		}
	
	}
	

}
