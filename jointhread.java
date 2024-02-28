// join() method

class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;++i)
		{
			System.out.println("Child thread");
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException is){}
			
		}
	}
}
class jointhread
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread t=new MyThread();
		t.start();
		t.join();
		for(int i=1;i<=10;++i)
		{
			System.out.println("Main Thread");
		}	
	}
}