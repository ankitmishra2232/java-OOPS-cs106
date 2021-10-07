import java.util.Scanner; //Get User input
import java.text.NumberFormat; //

public class ClientApp {
//private static final String EXIT = "EXIT";	
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
while (true) {
System.out.println("********Welcome to Calculator********");
System.out.println("This is the main menu");
System.out.println("Choose Options : ");
System.out.println("1. Addition");
System.out.println("2. Substraction");
System.out.println("3. Multiplcation");
System.out.println("4. Divide");
System.out.println("5. Modulus");
System.out.println("6. Square-Root");
System.out.println("7. Log");
System.out.println("8. Factorial");
System.out.println("Select your option : ");
int choice = input.nextInt();
/*if (choice == 9) {
    return;
}*/
switch (choice)
{
case 1:
Addition add = new Addition();
add.addition();
break;
case 2:
Subtraction sub = new Subtraction();
sub.substraction();
break;
case 3:
Multiplication mul = new Multiplication();
mul.multiplication();
break;
case 4:
Division divide = new Division();
divide.divide();
break;
case 5:
Modulus mod = new Modulus();
mod.modulus();
break;
case 6:
SquareRoot srt = new SquareRoot();
srt.sqrt();
break;
case 7:
Log logs = new Log();
logs.log();
break;
case 8:
Factorial fact = new Factorial();
fact.factorial();
break;
default:
    System.out.println("Wrong Choice.");
}
System.out.println("Go again?");
String goAgain = input.next();
if (!goAgain.equals("y")) {
   break;
} 

}}
}