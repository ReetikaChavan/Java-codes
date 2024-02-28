class sumarray
{
	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		int sum=0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the Arrays: ");
		for(int i=0;i<arr.length;++i)
		{
			arr[i]=sc.nextInt();
		}	
		for(int i=0; i<arr.length;++i)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array is: "+sum);
	}
}