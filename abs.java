// if the child is unable to provide implementation of all methods of abstract class then we can declare
//the child class with abstract modifier and complete the remaining method implementation in next created
// child class.


abstract class Test  
{
	abstract void n1();
	abstract void n2();
	abstract void n3();
	void n4() {
		System.out.println("n4 method");
	}
}
abstract class Test1 extends Test
{
	void n1(){
	System.out.println("n1 method");}
}
abstract class Test2 extends Test
{
	void n2(){
	System.out.println("n2 method");}
}
class abs extends Test2
{
	void n3()
	{
		System.out.println("n3 method");
	}
		public static void main(String[] args) 
		{
			abs a=new abs();
			a.n1();
			a.n2();
			a.n3();
			a.n4();
		}
	
}