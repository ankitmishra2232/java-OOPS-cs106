package human;

public class Citizen extends Character{
	

	private String Gender;
	private String age;
	private String Skin_color;
	public Citizen(String gender, String age, String skin_color) {
		super();
		Gender = gender;
		this.age = age;
		Skin_color = skin_color;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSkin_color() {
		return Skin_color;
	}
	public void setSkin_color(String skin_color) {
		Skin_color = skin_color;
	}
	
	
	

}
