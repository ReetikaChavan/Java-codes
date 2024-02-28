import java.util.*;
class palindrome
{
	public static void main(String[] args) 
	{
		int no,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		no=sc.nextInt();
		int nsave=no;
		while (no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}		
		if(nsave==rev)
		{
			System.out.println("It is an palindrome");
		}
		else 
		{
			System.out.println("It is not an palindrome");
		}
	}
}




class palindrome
{
	public static void main(String[] args) 
	{
		int no,rev=0,rem;
		int nsave=no;
		for (int i=1;i<=500; ++i)
		{
			int no=i;
			while(no>0)
			{
				rem=no%10;
				rev=rev*10+rem;
				no/=10;
			}
			if (i==rev)
			{
				System.out.println(i);
			}
		}

	}
}