import java.util.*;
class hash
{
	public static void main(String[] args) 
	{
		HashSet<String> h=new HashSet<String>();
		h.add("R");
		h.add("E");
		h.add("E");
		h.add("T");
		Iterator<String> itr = h.iterator();
		while(itr.hasNext())
		{
			String str = itr.next();
			System.out.println(str);
		}
		System.out.println(h);
	}
}