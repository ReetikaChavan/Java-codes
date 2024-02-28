import java.util.*;
class forfib
{
	public static void main(String[] args) 
	{
		int f0=0,f1=1,f2,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		n=sc.nextInt();
		System.out.println(f0+"\t"+f1);
		for (int i=3;i<=n;++i ) {
			f2=f0+f1;
			System.out.println("\t"+f2);
			f0=f1;
			f1=f2;

		}
	}
}