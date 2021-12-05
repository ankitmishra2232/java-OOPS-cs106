package vehicle;

public class Cycle extends Two_wheel {
	
	private int seat;

	public Cycle(int seat) {
		super();
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	
}
