import java.util.*;
class switchcase
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		System.out.println("5. Exit");
		System.out.println("Select any choice");
		int n=sc.nextInt();
		switch (n) {
			case 1: System.out.println("Addition = "+(n1+n2));
			break;
			case 2: System.out.println("Subtraction = "+(n1-n2));
			break;
			case 3: System.out.println("Division = "+(n1/n2));
			break;
			case 4: System.out.println("Multiplication = "+(n1*n2));
			break;
			case 5: System.exit(0);
			default: System.out.println("Invalid input");
			break;
		}
	}
}