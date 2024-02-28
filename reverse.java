import java.util.Scanner;
class reverse
{
	public static void main(String[] args) 
	{
		int no,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		no=sc.nextInt();
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("Reverse number is: "+rev);
	}
}