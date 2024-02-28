// Basic Array
import java.util.*;
class arr
{
	public static void main(String[] args) 
	{
		int arr[]=new int[10];
		int sum=0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the array: ");
		for(int i=0; i<10;++i)
		{
			arr[i]=sc.nextInt();
		}	
		for (int i=arr.length-1;i<=0;--i)
		{
			System.out.println(arr[i]);
		}
	}
}