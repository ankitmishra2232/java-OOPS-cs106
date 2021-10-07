import java.util.Scanner;

public class Factorial {
	static void factorial(){
		int n, c, f = 1;

		System.out.println("Enter an integer to calculate its factorial");
		Scanner math1 = new Scanner(System.in);

		n = math1.nextInt();

		if (n < 0)
		System.out.println("Number should be non-negative.");
		else{
		for (c = 1; c <= n; c++)
		f = f*c;

		System.out.println("Factorial of "+n+" is = "+f);
		}

}}