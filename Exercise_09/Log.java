import java.util.Scanner;

public class Log {
	static void log() {
		Scanner math1 = new Scanner(System.in);
		Double n;
		System.out.print("Enter a number: ");
		n = math1.nextDouble();
		System.out.println("n= "+n);
		System.out.println("Common logarithm value of n is "+(Math.log10(n)));
		System.out.println("Natural logarithm of " + n + " = " + Math.log(n));
		}

}