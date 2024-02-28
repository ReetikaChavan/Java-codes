// Accept 3 paper marks, if paper marks less than 45 show "fail" or show "pass"

import java.util.Scanner;
class ifelse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter paper 1 marks: ");
		int p1=sc.nextInt();
		System.out.println("Enter paper 2 marks: ");
		int p2=sc.nextInt();
		System.out.println("Enter paper 3 marks: ");
		int p3=sc.nextInt();
		if ((p1<=45) && (p2<=45) && (p3<=45)){
			System.out.println("fail");
		}
		else{
			System.out.println("Pass");
		}

	}
}


// Accept 3 paper marks find total and per.
import java.util.Scanner;
class ifelse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter paper 1 marks: ");
		int p1=sc.nextInt();
		System.out.println("Enter p2 marks: ");
		int p2=sc.nextInt();
		System.out.println("Enter p3 marks: ");
		int p3=sc.nextInt();
		int total=p1+p2+p3;
		double percentage = total/3;
		System.out.println("Enter gender (f/m): ");
		char gender=sc.next().charAt(0);
		if (percentage>=82 && gender=='f'){
			System.out.println("she can take admission");
		}
		else{
			System.out.println("no admission");
		}
	}
}


import java.util.Scanner;
class ifelse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year: ");
		int year=sc.nextInt();
		if (year%100!=0){
			if(year%4==0){
			System.out.println("Non century year");
		}else{
			System.out.println("Not a leap year");
		}
	}
	else{
			if (year%400==0){

			}else{
				System.out.println("Not a leap year");
			}
		}
		
	}
}

