package construction;

public class Club extends Construction {
	
	private String show;
	private int show_time;
	
	



	public Club(String show, int show_time) {
		super();
		this.show = show;
		this.show_time = show_time;
	}



	public int getShow_time() {
		return show_time;
	}


	public void setShow_time(int show_time) {
		this.show_time = show_time;
	}


	public String getShow() {
		return show;
	}

	public void setShow(String show) {
		this.show = show;
	}

}
