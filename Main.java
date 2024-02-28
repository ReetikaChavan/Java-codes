// class Main 
// {
//     static int i=5;
//     static public void show()
//     {
//         System.out.println("value of i= "+i);
//     }
//     public static void main(String args[])
//     {
//         Main.show();
//     }
// }

// class Main
// {
//     public static void main(String args[])
//     {
//         byte b=(byte)9561467;
//         System.out.println(b);
//     }
// }


// import java.util.Scanner;
// class Main
// {
//     public static void main(String[] args) 
//     {
//         int a;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter value for a and b ");
//         a=sc.nextInt();
//         int b=sc.nextInt();
//         int res=a+b;
//         System.out.println("The Addition of "+a+" and "+b+" is " +res);

//     }
// }


// import java.util.Scanner;
// class Main 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter 5 digi no ");
//         int number=sc.nextInt();
        
//     }
// }

// import java.util.Scanner;
// class Main
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n=sc.nextInt();
//         if (n>0) {
//             System.out.println(n+ " is positive");
//         }
//         if (n<0){
//             System.out.println(n+ " is negative ");
//         }
//         if (n==0){
//             System.out.println(n+ " is zero ");
//         }

//     }
// }

// import java.util.Scanner;
// class Main
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number : ");
//         int a=sc.nextInt();
//         System.out.println("Enter the number : ");
//         int b=sc.nextInt();
//         System.out.println("Enter the number : ");
//         int c=sc.nextInt();
//         System.out.println("Enter the number : ");
//         int d=sc.nextInt();
//         System.out.println("Enter the number : ");
//         int e=sc.nextInt();
//         int max=a;
//         if (max<b)
//         {
//             max=b;
//         }
//         if (max<c);
//         {
//             max=c;
//         }
//         if (max<d)
//         {
//             max=d;
//         }
//         if (max<e)
//         {
//             max=e;
//         }

//         System.out.println("The maximum value is: " + max);

//     }
// }


import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out .println("Enter age: ");
        int age=sc.nextInt();
        if (age>=18)
        {
            System.out.println("Eligable for vote");
        }
        else{
            System.out.println("Not eligable for vote");
        }
    }
}