package world;

import human.*;
import vehicle.*;
import weapons.Weapon;


public class World {
	
	private static Car car1 =new Car(50, "sports");
	private static Player pl1 = new Player(null, null, 0, null);
	private static Citizen c1;
	private static Police p1;
	private static Weapon w1;
	private static Police po1;
	private static Bike b1;
	private static Weapon ak47;
	public static Car getCar1() {
		return car1;
	}
	public static void setCar1(Car car1) {
		World.car1 = car1;
	}
	public static Player getPl1() {
		return pl1;
	}
	public static void setPl1(Player pl1) {
		World.pl1 = pl1;
	}
	public static Citizen getC1() {
		return c1;
	}
	public static void setC1(Citizen c1) {
		World.c1 = c1;
	}
	public static Police getP1() {
		return p1;
	}
	public static void setP1(Police p1) {
		World.p1 = p1;
	}
	public static Weapon getW1() {
		return w1;
	}
	public static void setW1(Weapon w1) {
		World.w1 = w1;
	}
	public static Police getPo1() {
		return po1;
	}
	public static void setPo1(Police po1) {
		World.po1 = po1;
	}
	public static Bike getB1() {
		return b1;
	}
	public static void setB1(Bike b1) {
		World.b1 = b1;
	}
	public static Weapon getAk47() {
		return ak47;
	}
	public static void setAk47(Weapon ak47) {
		World.ak47 = ak47;
	}
	
	public static void drive_player() {
		car1.setName("audi"); 
		pl1.setName("Ram");
		System.out.println(car1.getName()+" car is being drive by "+pl1.getName());
	}


	
}
