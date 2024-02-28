// Greater number

import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=sc.nextInt();
        System.out.println("Enter the number : ");
        int b=sc.nextInt();
        System.out.println("Enter the number : ");
        int c=sc.nextInt();
        System.out.println("Enter the number : ");
        int d=sc.nextInt();
        System.out.println("Enter the number : ");
        int e=sc.nextInt();
        int max=a;
        if (max<b)
        {
            max=b;
        }
        if (max<c);
        {
            max=c;
        }
        if (max<d)
        {
            max=d;
        }
        if (max<e)
        {
            max=e;
        }

        System.out.println("The maximum value is: " + max);

    }
}


// Smaller number

import java.util.Scanner;
class maxmin
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=sc.nextInt();
        System.out.println("Enter the number : ");
        int b=sc.nextInt();
        System.out.println("Enter the number : ");
        int c=sc.nextInt();
        System.out.println("Enter the number : ");
        int d=sc.nextInt();
        System.out.println("Enter the number : ");
        int e=sc.nextInt();
        int min=a;
        if (min>b)
        {
            min=b;
        }
        if (min>c);
        {
            min=c;
        }
        if (min>d)
        {
            min=d;
        }
        if (min>e)
        {
            min=e;
        }

        System.out.println("The minimum value is: " + min);

    }
}