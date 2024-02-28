// Array Frame 

import java.util.ArrayList;
class arrayframe
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("R");
		al.add(120);
		al.add("R");
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2, "C");
		al.add("S");
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);	
	}
}