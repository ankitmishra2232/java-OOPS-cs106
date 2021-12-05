package vehicle;

public class AirVehicle extends Other_vehicle{

	private String Govt_or_private;
	private String war_or_commercial;
	public AirVehicle(String govt_or_private, String war_or_commercial) {
		super();
		Govt_or_private = govt_or_private;
		this.war_or_commercial = war_or_commercial;
	}
	public String getGovt_or_private() {
		return Govt_or_private;
	}
	public void setGovt_or_private(String govt_or_private) {
		Govt_or_private = govt_or_private;
	}
	public String getWar_or_commercial() {
		return war_or_commercial;
	}
	public void setWar_or_commercial(String war_or_commercial) {
		this.war_or_commercial = war_or_commercial;
	}
	

}
