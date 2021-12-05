package construction;

public class Road {
	private int no_ofLane;
	private String typeOfRoad;
	public Road(int no_ofLane, String typeOfRoad) {
		super();
		this.no_ofLane = no_ofLane;
		this.typeOfRoad = typeOfRoad;
	}
	public int getNo_ofLane() {
		return no_ofLane;
	}
	public void setNo_ofLane(int no_ofLane) {
		this.no_ofLane = no_ofLane;
	}
	public String getTypeOfRoad() {
		return typeOfRoad;
	}
	public void setTypeOfRoad(String typeOfRoad) {
		this.typeOfRoad = typeOfRoad;
	}
	

}
