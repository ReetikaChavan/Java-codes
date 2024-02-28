import java.util.Scanner;
class forseries
{
	public static void main(String[] args) 
	{
		double sum=1;
		int x, n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth value");
		n=sc.nextInt();
		System.out.println("Enter x value ");
		x=sc.nextInt();
		for (int i=1;i<=n;++i ) {
				sum=sum+((Math.pow(x,i))/i);
			}	
			System.out.println("the series is "+sum);
	}
}