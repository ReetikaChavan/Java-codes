// implementing interface

interface I1
{
	//public, static and final
	int a = 20;
	// public and abstract methods
	void n1();
	void n2();
}
class implementinginter implements I1
{
	public void n1()
	{
		System.out.println("n1 method implementation");
		System.out.println(a);
	}
	public void n2()
	{
		System.out.println("n2 method implementation");
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		implementinginter t=new implementinginter();
		t.n1(); t.n2();
		I1 i=new implementinginter();  // interface variable is able to hold the implemenration class objects
		i.n1(); i.n2();
	}
}