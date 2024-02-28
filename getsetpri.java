class getsetpri extends Thread
{
	public void  run()
	{
		System.out.println("Inside run method");
	}
	public static void main(String[] args) 
	{
		getsetpri t1 = new getsetpri();
		getsetpri t2 = new getsetpri();
		getsetpri t3 = new getsetpri();
	    System.out.println("t1 thread priority : "+t1.getPriority());	
	    System.out.println("t2 thread priority : "+t2.getPriority());	
	    System.out.println("t3 thread priority : "+t3.getPriority());	
	    t1.setPriority(2);
	    t2.setPriority(6);
	    t3.setPriority(9); //if the setpriority is set as 21 for t3 then it will throw the IllegegalArgumentException
	    System.out.println("t1 thread priority : "+t1.getPriority());
	    System.out.println("t2 thread priority : "+t2.getPriority());
	    System.out.println("t3 thread priority : "+t3.getPriority());
	}
}