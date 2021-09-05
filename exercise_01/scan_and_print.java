package exercise_01;
import java.util.*; 	
public class scan_and_print {

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter number of numbers- ");  
		int n=sc.nextInt();
		int[] array = new int[n]; 
		System.out.print("Enter"+n+ "integers: ");  
		for(int i=0;i< n;i++) 
		{
			array[i]=sc.nextInt();
		}
		System.out.println("\nArray elements are: "); 
		for (int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
		
		
	}

}
