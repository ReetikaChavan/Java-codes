class userarray
{
	public static void main(String[] args) {
		int arr[]=new int[5];
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the Array: ");
		for(int i=0;i<5;++i)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Arrays data are: ");
		for(int i=0;i<arr.length;++i)
		{
			System.out.println(arr[i]);
		}
	}
}