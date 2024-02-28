interface I1
{
	void show1();
	void show2();
}
class Abc implements I1
{
	public void show1() 
	{
		System.out.println("Show1");
	}
	public void show2()
	{

	}
}
class interfacee
{
	public static void main(String[] args)
	{
		Abc obj=new Abc();
		obj.show1();
	}
}