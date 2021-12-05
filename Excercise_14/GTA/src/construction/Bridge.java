package construction;

public class Bridge extends Construction{
	private String type_of;
	private int pillars;
	public Bridge(String type_of, int pillars) {
		super();
		this.type_of = type_of;
		this.pillars = pillars;
	}
	public String getType_of() {
		return type_of;
	}
	public void setType_of(String type_of) {
		this.type_of = type_of;
	}
	public int getPillars() {
		return pillars;
	}
	public void setPillars(int pillars) {
		this.pillars = pillars;
	}
	

}
