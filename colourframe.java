import java.util.*;
class colourframe
{
	public static void main(String[] args) 
	{
		ArrayList<String> colour_list=new ArrayList<>(4);
		colour_list.add("Blue");
		colour_list.add("Black");
		colour_list.add("Grey");
		colour_list.add("voilet");
		System.out.println("*** Color list ***");
		for(int i=0;i<4;i++)
		{
			System.out.println(colour_list.get(i).toString());
		}	
		ArrayList<String> sample=new ArrayList<>(3);
		sample.add("Yellow");
		sample.add("Red");
		sample.add("White");
		colour_list.addAll(sample);
		System.out.println("New Color list is: "+colour_list.size());
		System.out.println("*** color list ***");
		for(int i=0;i<colour_list.size();i++)
		{
			System.out.println(colour_list.get(i).toString());
		}	
	}
}