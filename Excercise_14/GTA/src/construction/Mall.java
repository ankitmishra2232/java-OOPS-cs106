package construction;

public class Mall extends Construction {
	
	private int no_of_parkings;
	private int floor;
	
	public Mall(int no_of_parkings, int floor) {
		super();
		this.floor=floor;
		this.no_of_parkings=no_of_parkings;
}

	public int getNo_of_parkings() {
		return no_of_parkings;
	}

	public void setNo_of_parkings(int no_of_parkings) {
		this.no_of_parkings = no_of_parkings;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
		

}
