
// code for range using switch case
import java.util.Scanner;
 
class range
{
    public static void main(String []s)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount:");
        int a = sc.nextInt();
        System.out.println("Enter range:");
        int r = sc.nextInt();

        int n2000 = 0,n500 = 0,n200 = 0,n100 = 0,n50 = 0,n20 = 0,n10 = 0,n5 = 0,n2 = 0,n1 = 0;
        
        switch(r) {
            case 2000:
                n2000 = a/2000;
                a %= 2000;
                System.out.println("Number of 2000 Rs Notes: "+ n2000);
            case 500:
                n500 = a/500;
                a %= 500;
                System.out.println("Number of 500 Rs Notes: "+ n500);

            case 200:
                n200 = a/200;
                a %= 200;
                System.out.println("Number of 200 Rs Notes: "+ n200);

            case 100:
                n100 = a/100;
                a %= 100;
                System.out.println("Number of 100 Rs Notes: "+ n100);

            case 50:
                n50 = a/50;
                a %= 50;
                System.out.println("Number of 50 Rs Notes: "+ n50);

            case 20:
                n20 = a/20;
                a %= 20;
                System.out.println("Number of 20 Rs Notes: "+ n20);

            case 10:
                n10 = a/10;
                a %= 10;
                System.out.println("Number of 10 Rs Notes: "+ n10);

            case 5:
                n5 = a/5;
                a %= 5;
                System.out.println("Number of 5 Rs Notes: "+ n5);

            case 2:
                n2 = a/2;
                a %= 2;
                System.out.println("Number of 2 Rs Notes: "+ n2);

            case 1:
                n1 = a/1;
                a %= 1;
                System.out.println("Number of 1 Rs Notes: "+ n1);
                break;
            default:
                System.out.println("Invalid Range. Try putting some other range.");

        }
        int n = n2000 + n500 + n200 + n100 + n50 + n20 + n10 + n5 + n2 + n1;
        System.out.println("Total Number of notes = "+ n);
    }
}