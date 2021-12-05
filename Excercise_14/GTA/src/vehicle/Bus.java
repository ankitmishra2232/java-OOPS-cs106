package vehicle;

public class Bus extends Vehicle {
	private String type;  //AC or non ac
	private String private_or_public;
	public Bus(String type, String private_or_public) {
		super();
		this.type = type;
		this.private_or_public = private_or_public;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrivate_or_public() {
		return private_or_public;
	}
	public void setPrivate_or_public(String private_or_public) {
		this.private_or_public = private_or_public;
	}
	

}
