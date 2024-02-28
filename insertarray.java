
//insert an element at the specific position in the array


import java.util.*;
class insertarray
{
	public static void main(String[] args) 
	{
		int[]arr= {12,13,14,15,16,17,18,19};
		int indexPosition=2;
		int newValue=5;
		System.out.println("OriginalArray: "+Arrays.toString(arr));
		for (int i=arr.length-1;i>indexPosition;i-- ) 
		{
			arr[i]=arr[i-1];		
		}	
		arr[indexPosition]=newValue;
		System.out.println("New Array: "+Arrays.toString(arr));
	}
}