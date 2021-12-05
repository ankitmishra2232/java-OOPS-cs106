package construction;

public class Clothing_shop extends Construction {
	private int price;
	private String type;
	
	public Clothing_shop(int price, String type) {
		super();
		this.price = price;
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
