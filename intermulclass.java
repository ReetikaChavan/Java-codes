
//implementing interface in multiple class

interface RBI
{
	void findInterface();
}
class SBI implements RBI
{
	public void findInterface()
	{
		System.out.println("SBI intrest logic implementation");
	}
}
class PNB implements RBI
{
	public void findInterface()
	{
		System.out.println("PNB intrest logic implementation");
	}
}
class MHB implements RBI
{
	public void findInterface()
	{
		System.out.println("MHB intrest logic implementation");
	}
}
class intermulclass
{
	public static void main(String[] args) 
	{
		RBI r1,r2,r3;
		r1=new SBI();
		r2=new PNB();
		r3=new MHB();
		r1.findInterface();
		r2.findInterface();
		r3.findInterface();
	}
}