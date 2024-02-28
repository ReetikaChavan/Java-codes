// program for abstract and non abstract methods

abstract class Test 
{
	abstract void n1();
	abstract void n2();
	abstract void n3();
	abstract void n4();
	{
		System.out.println("n4 non abstract class");
	}
}
class abstractt extends Test
{
	void n1()
	{
		System.out.println("n1 abstract method ");
	}
	void n2()
	{
		System.out.println("n2 abstract method ");
	}
	void n3()
	{
		System.out.println("n3 abstract method ");
	}
	void n4()
	{
		System.out.println("n4 non-abstract method ");
	}
	public static void main(String[] args) 
	{
		abstractt a=new abstractt();
		a.n1();
		a.n2();
		a.n3();
		a.n4();

	}

}