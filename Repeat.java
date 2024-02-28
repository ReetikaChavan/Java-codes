
//calculate the minimum number of operations required to transform one input string into another.
import java.util.Scanner;

public class Repeat{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
        System.out.println("enter first string: ");
        String s=sc.nextLine();
        System.out.println("enter second string: ");
        String t=sc.nextLine();
        int output=0,length=0;

        if(s.length()<t.length()){
        	output=t.length()-s.length();
        }
        else if(t.length()<s.length()){
        	output=s.length()-t.length();
        }
        else if(s.length()==t.length()){	
        	for(int i=0;i<s.length()-1;++i){
        		for(int j=0;j<t.length()-1;++j){
        			if(s.charAt(i)==t.charAt(j)){
        				System.out.println("There are no new operations ");
        				break;
        			}
        			else{
        				length++;
        			}
        			System.out.println("number of operations="+length);
        		}
        	}
        }

    }
    
}
	