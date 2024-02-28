import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a binary string: ");
        String s=sc.nextLine();
        int count =0;
        if(s.length()==5){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                count ++;
                }
          
            }
        }
        else{
            System.out.println("Enter correct input");
            
        }

        System.out.println("the number of 1s: "+count);

    }
}
