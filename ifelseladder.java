// Accept a character and check character is upper case , lower case, digit or special symbol

import java.util.Scanner;
class ifelseladder
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the ch: ");
			int ch=sc.next().charAt(0);
			if (ch>=65 && ch<=90) {
				System.out.println("Character is upper case");
			}
			else if (ch>=97 && ch<=122){
				System.out.println("Charater is Lower case");
			}
			else if (ch>=48 && ch<=57){
				System.out.println("Character is Digit");
			}
			else{
				System.out.println("Character is Special Symbol");
			}

	}
}

// Accept for paper marks find total , perc, and assigned a grade. 

import java.util.Scanner;
class ifelseladder
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter p1 marks: ");
		int p1=sc.nextInt();
		System.out.println("Enter p2 marks: ");
		int p2=sc.nextInt();
		System.out.println("Enter p3 marks: ");
		int p3=sc.nextInt();
		System.out.println("Enter p4 marks: ");
		int p4=sc.nextInt();
		int total=p1+p2+p3+p4;
		double percentage = total/4;
		if (percentage >= 90) 
		{
            System.out.println("Grade A");
        } 
        else if (percentage >= 80) 
        {
            System.out.println("Grade B");
        } 
        else if (percentage >= 70) 
        {
            System.out.println("Grade C");
        } 
        else if (percentage >= 60) 
        {
            System.out.println("Grade D");
        } 
        else if (percentage >= 40) 
        {
            System.out.println("Grade E");
        } 
        else 
        {
            System.out.println("Fail");
        }

	}
}