
import construction.Club;
import construction.Mall;
import world.World;
public class Game {

	
	

	public static void main(String[] args) {
	
		
		System.out.println("Welcome to Grand theft Auto\n");
		
		Club c1 = new Club("Second_show", 1500);
		c1.setConstruction_name("\t Dance Club");
		System.out.println(c1.getShow()+c1.getConstruction_name());
		
		Mall m = new Mall(2, 4);
		m.setConstruction_name("Vishal Mega Mart");
		System.out.println(m.getConstruction_name()+" with "+m.getFloor()+" floors and has "+m.getNo_of_parkings()+" number of parkings ");
		
		World w = new World();
		w.drive_player();

		
	}

}