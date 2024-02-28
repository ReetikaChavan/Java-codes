
// power of the number.
import java.util.Scanner;

public class Power {
    public void isPower(int n){
        for(int i=1;i<n+2;++i){
            if((i*i*i*i)==n){
                System.out.println(n+" is the power of 4");
                break;
            }
            else if(i>n){
                System.out.println(n+" is not a power of 4");
            
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Power obj=new Power();
        System.out.println("Enter the number");
        int n=sc.nextInt();
        obj.isPower(n);
        sc.close();
        

    }
    
}
