import java.util.Scanner;

public class BadVersion1 {
    public void isBadVersion(int n, int bad) {
        if (n < bad) {
            System.out.println(n + " is " + false);
        } 
        else {
            System.out.println(n + " is " + true);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BadVersion1 bd = new BadVersion1();
        System.out.println("Enter the number of versions: ");
        int n = sc.nextInt();
        System.out.println("Enter number of bad versions: ");
        int bad = sc.nextInt();
        bd.isBadVersion(n, bad);
    }
}
