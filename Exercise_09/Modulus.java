import java.util.Scanner;

public class Modulus {
	static void modulus(){
		Scanner math1 = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.println("First Num");
		a = math1.nextFloat();
		System.out.print("Second Num");
		b = math1.nextFloat();
		c = a % b;
		System.out.println ("The total value is " + c);
		return;
		}

}
