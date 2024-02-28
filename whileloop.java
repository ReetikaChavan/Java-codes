//while loop basic code 
// 1st code
class whileloop
{
	public static void main(String[] args) 
	{
		int i=1;
		while(i<=10){
			System.out.println(i);
			++i;
		}
	}
}



// //2nd code  second method

class whileloop
{
	public static void main(String[] args) 
	{
		int i=1, sum=0;
		while(i<=10){
			sum=sum+i;
			++i;
		}
		System.out.println("sum = "+sum);
	}
}