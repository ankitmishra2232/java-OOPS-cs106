package vehicle;

public class Bike extends Two_wheel {
	
	private int seats;
	private int mileage;
	public Bike(int seats, int mileage) {
		super();
		this.seats = seats;
		this.mileage = mileage;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
	

}
