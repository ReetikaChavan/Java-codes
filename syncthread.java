
// Synchronization of thread

class A 
{
	public static synchronized void print(String name)
	{
		for (int i=0;i<3;i++)
		{
			System.out.println("Batting = "+name);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException is)
			{
				is.printStackTrace();
			}
		}
	}
}
class MyThread1 extends Thread
{
	public void run()
	{
		A.print("Reetika");
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		A.print("Josh");
	}
}
class MyThread3 extends Thread
{
	public void run()
	{
		A.print("Kedar");
	}
}
class syncthread
{
	public static void main(String[] args) 
	{
		new MyThread1().start();
		new MyThread2().start();
		new MyThread3().start();	
	}
}