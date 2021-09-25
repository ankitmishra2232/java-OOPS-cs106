
public class ClientApp {

	public static void main(String[] args) {
		Customer c0 = new Customer("Ram", 1200);
		Customer c1 = new Customer("komal", 2500);
		Customer c2 = new Customer("mohan", 2500);
		
		HairStylist hs0 = new HairStylist("stylist 1", 25000);
		HairStylist hs1 = new HairStylist("stylist 2", 26000);
		
		MultiTaskStaff mts0 = new MultiTaskStaff("Mts1", 16000);
		MultiTaskStaff mts1 = new MultiTaskStaff("Mts2", 15000);
		
		User[] userList = {c0,c1, c2, hs0,hs1, mts0,mts1};
		
		System.out.println("Names of Users of Hair Saloon:-\n");
		for( int i = 0; i < userList.length; i++) {
			userList[i].printName();
		}
		
		
		Staff[] staffList =  {hs0, hs1, mts0, mts1};
		System.out.println("\nTotal Salary of Staff: " + Staff.calculateSalary(staffList));
	}

}