//how to find Armstrong number.

import java.util.*;
class amstrong
{
	public static void main(String[] args) 
	{
		int no,sum=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		no=sc.nextInt();
		int nsave=no;
		while (no>0)
		{
			no=no/10;
			rem=no%10;
			sum=sum+(rem*rem*rem);
		}		
		if(nsave==sum)
		{
			System.out.println("It is an Armstrong no");
		}
		else 
		{
			System.out.println("It is not an Armstrong no");
		}
	}
}


