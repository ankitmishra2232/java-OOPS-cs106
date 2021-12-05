package human;

public class Police extends Character{
	private String type_of_police;
	private int noOfWeapon;
	public Police(String type_of_police, int noOfWeapon) {
		super();
		this.type_of_police = type_of_police;
		this.noOfWeapon = noOfWeapon;
	}
	public String getType_of_police() {
		return type_of_police;
	}
	public void setType_of_police(String type_of_police) {
		this.type_of_police = type_of_police;
	}
	public int getNoOfWeapon() {
		return noOfWeapon;
	}
	public void setNoOfWeapon(int noOfWeapon) {
		this.noOfWeapon = noOfWeapon;
	}
	

}
