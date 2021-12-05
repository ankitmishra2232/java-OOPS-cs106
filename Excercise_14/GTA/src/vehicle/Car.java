package vehicle;

public class Car extends Four_wheeler {
	private int Mileage;
	private String TypeOfCar;  //sports, offroad  etc
	public Car(int mileage, String typeOfCar) {
		super();
		Mileage = mileage;
		TypeOfCar = typeOfCar;
	}
	public int getMileage() {
		return Mileage;
	}
	public void setMileage(int mileage) {
		Mileage = mileage;
	}
	public String getTypeOfCar() {
		return TypeOfCar;
	}
	public void setTypeOfCar(String typeOfCar) {
		TypeOfCar = typeOfCar;
	}
		
}
