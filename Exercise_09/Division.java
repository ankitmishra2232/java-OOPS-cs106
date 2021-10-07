import java.util.Scanner;

public class Division {
	static void divide(){
		Scanner math1 = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.println("First Num");
		a = math1.nextFloat();
		System.out.print("Second Num");
		b = math1.nextFloat();
		c = a / b;
		System.out.println ("The total value is " + c);
		return;
		}

}
