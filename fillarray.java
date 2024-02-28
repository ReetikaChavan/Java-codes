// fill element in an array


import java.util.*;
class fillarray
{
	public static void main(String[] args) 
	{
		int arr[]=new int[6];
		Arrays.fill(arr,10);
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(""+arr[i]);
		}
		System.out.println();
		Arrays.fill(arr,3,6,40);
		System.out.println(Arrays.toString(arr));
	}
}