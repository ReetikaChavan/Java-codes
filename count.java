// count the digits
import java.util.*;
class count
{
	public static void main(String[] args) 
	{
		int no,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		no=sc.nextInt();
		while(no>0)
		{
			no=no/10;
			++count;
		}
		System.out.println("Count of number is: "+count);
	}
}





// // Accept a number and find multiplication of any number.
import java.util.*;
class count
{
	public static void main(String[] args) 
	{
		int no,sum=1,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		no=sc.nextInt();
		while(no>0)
		{
			rem=no%10;
			sum=sum*rem;
			no=no/10;
		}
		System.out.println("Multipication of number is: "+sum);
	}
}




//Accept the number and find factorial of entered number
import java.util.*;
class count
{
	public static void main(String[] args) 
	{
		int no,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		no=sc.nextInt();
		while(no>0)
		{
			fact=fact*no;
			--no;
		}	
		System.out.println("Factorial of the no is: "+fact);
	}
}




// accept the number and find the sum of digits of any number

import java.util.*;
class count
{
	public static void main(String[] args) 
	{
		int no,sum=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		no=sc.nextInt();
		while(no>0)
		{
			no=no/10;
			rem=no%10;
			sum=sum+rem;
		}	
		System.out.println("Sum of the number is: "+sum);
	}
}