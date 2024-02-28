import java.util.Scanner;
class nested
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cost price: ");
		int cp=sc.nextInt();
		System.out.println("Are you a student (y/n): ");
		char s=sc.next().charAt(0);
		double ds;
		if(s=='y')
		{
			if(cp>=500)
			{
				ds=0.1;
			}
			else{
				ds=0.05;
			}
		}
		else {
			if (cp>=500){
				ds=0.78;
			}
			else{
				ds=0.02;
			}
		}
		System.out.println("Cost price: " +cp);
		System.out.println("Total price: " +(ds*100)+"%");
		System.out.println("Net cost price: " +(cp-ds));
			
	}
}