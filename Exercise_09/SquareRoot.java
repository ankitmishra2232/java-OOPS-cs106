import java.util.Scanner;

public class SquareRoot {
	static void sqrt() {
		Scanner math1 = new Scanner(System.in);
		Double num;
		System.out.print("Enter a number: ");
		num = math1.nextDouble();
		Double square = Math.pow(num, 2);
		System.out.println("Square of "+ num + " is: "+ square);
		}

}
