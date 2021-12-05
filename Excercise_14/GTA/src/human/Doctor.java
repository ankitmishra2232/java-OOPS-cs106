package human;

public class Doctor extends Character {
	
	private int Experince;
	private String specialization;
	public Doctor(int experince, String specialization) {
		super();
		Experince = experince;
		this.specialization = specialization;
	}
	public int getExperince() {
		return Experince;
	}
	public void setExperince(int experince) {
		Experince = experince;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	

}
