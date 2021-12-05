package weapons;



public class Weapon {
	
	private String weapon_name;
	private String weapon_type;
	public String getWeapon_type() {
		return weapon_type;
	}
	public void setWeapon_type(String weapon_type) {
		this.weapon_type = weapon_type;
	}
	private int no_of_bullets;
	private int range;
	private String fire_type;
	
	
	
	public String getWeapon_name() {
		return weapon_name;
	}
	public void setWeapon_name(String weapon_name) {
		this.weapon_name = weapon_name;
	}
	public int getNo_of_bullets() {
		return no_of_bullets;
	}
	public void setNo_of_bullets(int no_of_bullets) {
		this.no_of_bullets = no_of_bullets;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public String getFire_type() {
		return fire_type;
	}
	public void setFire_type(String fire_type) {
		this.fire_type = fire_type;
	}
	public Weapon(String weapon_name, String weapon_type, int no_of_bullets, int range, String fire_type) {
		super();
		this.weapon_name = weapon_name;
		this.weapon_type = weapon_type;
		this.no_of_bullets = no_of_bullets;
		this.range = range;
		this.fire_type = fire_type;
	}
	

}
