
//copy an array into another array

import java.util.*;
class copyarray
{
	public static void main(String[] args) 
	{
		int a1[]=new int[]{22,25,26,27,28};
		int a2[]=Arrays.copyOf(a1,4);
		System.out.println(Arrays.toString(a2));
		int a3[]=new int[10];
		System.arraycopy(a2,0,a3,0,4);
		System.out.println(Arrays.toString(a3));	
	}
}