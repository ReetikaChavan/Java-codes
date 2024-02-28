import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String a=sc.next();
        String rev="";

        for(int i=a.length()-1;i>=0;i--){
            rev +=a.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(a)){
            System.out.println("String is palindrome ");
        }else{
            System.out.println("String is not palindrome ");
        }
        sc.close();
    

    }
}
