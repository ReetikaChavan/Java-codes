class twoarray
{
	public static void main(String[] args) 
	{
		int arr[][]=new int [3][3];
		int sum=0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Arrays of element: ");
		for (int i=0;i<arr.length;++i ) 
		{
			for (int j=0;j<arr.length;++j ) 
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<arr.length;++i ) 
			{
				for (int j=0;j<arr.length;++j)
				{
					sum=sum+arr[i][j];
				}	
			}
			System.out.println("Sum of the array is: "+sum);

	}
}










