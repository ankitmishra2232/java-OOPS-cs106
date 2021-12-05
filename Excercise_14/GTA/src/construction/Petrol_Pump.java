package construction;

public class Petrol_Pump {
	private int num_of_machine;
	private int priceOfPetrol;
	private int priceOfDiesel;
	public Petrol_Pump(int num_of_machine, int priceOfPetrol, int priceOfDiesel) {
		super();
		this.num_of_machine = num_of_machine;
		this.priceOfPetrol = priceOfPetrol;
		this.priceOfDiesel = priceOfDiesel;
	}
	public int getNum_of_machine() {
		return num_of_machine;
	}
	public void setNum_of_machine(int num_of_machine) {
		this.num_of_machine = num_of_machine;
	}
	public int getPriceOfPetrol() {
		return priceOfPetrol;
	}
	public void setPriceOfPetrol(int priceOfPetrol) {
		this.priceOfPetrol = priceOfPetrol;
	}
	public int getPriceOfDiesel() {
		return priceOfDiesel;
	}
	public void setPriceOfDiesel(int priceOfDiesel) {
		this.priceOfDiesel = priceOfDiesel;
	}
	

}
