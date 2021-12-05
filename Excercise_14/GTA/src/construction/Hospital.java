package construction;

public class Hospital extends Construction {
	
	private int no_of_beds;
	private String colour_of_building;
	private int no_of_ambulances;
	
	public Hospital(int no_of_beds, String colour_of_building, int no_of_ambulances) {
		super();
		this.no_of_beds = no_of_beds;
		this.colour_of_building = colour_of_building;
		this.no_of_ambulances = no_of_ambulances;
	}
	public int getNo_of_beds() {
		return no_of_beds;
	}
	public void setNo_of_beds(int no_of_beds) {
		this.no_of_beds = no_of_beds;
	}
	public String getColour_of_building() {
		return colour_of_building;
	}
	public void setColour_of_building(String colour_of_building) {
		this.colour_of_building = colour_of_building;
	}
	public int getNo_of_ambulances() {
		return no_of_ambulances;
	}
	public void setNo_of_ambulances(int no_of_ambulances) {
		this.no_of_ambulances = no_of_ambulances;
	}
	
	
	
}
