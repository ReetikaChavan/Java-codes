import java.util.*;
class forfact
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		n=sc.nextInt();
		int fact=1;
		for(int i=1; i<=n ; ++i){
			fact= fact * i;
		}
		System.out.println("factorial of number is: "+fact);
	}
}