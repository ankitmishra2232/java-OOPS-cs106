package human;

public class Player extends Character {
	private String Skin_color;
	private String hair_color;
	private int hight;
	private String eye_color;
	public Player(String skin_color, String hair_color, int hight, String eye_color) {
		super();
		Skin_color = skin_color;
		this.hair_color = hair_color;
		this.hight = hight;
		this.eye_color = eye_color;
	}
	public String getSkin_color() {
		return Skin_color;
	}
	public void setSkin_color(String skin_color) {
		Skin_color = skin_color;
	}
	public String getHair_color() {
		return hair_color;
	}
	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public String getEye_color() {
		return eye_color;
	}
	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}
	
	
}
