package construction;

public class Barber_shop extends Construction {
	private int price;
	
	public Barber_shop(String shop_name,int price) {
		super();
		this.price=price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
