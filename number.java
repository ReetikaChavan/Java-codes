import java.util.Scanner;
class number
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if (n>0) {
            System.out.println(n+ " is positive");
        }
        if (n<0){
            System.out.println(n+ " is negative ");
        }
        if (n==0){
            System.out.println(n+ " is zero ");
        }

    }
}