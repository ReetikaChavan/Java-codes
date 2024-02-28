import java.util.*;
class infoarray
{
	public static void main(String[] args) 
	{
		int rollno=new int[10];
		String name[]=new String[10];
		String city[]=new String[10];
		String mob[]=new String[10];
		int i=0;
		Scanner sc=new Scanner(System.in);
		public void inputData()
		{
			System.out.println("Enter rollno: ");
			rollno[i]=sc.nextInt();
			System.out.println("Enter name: ");
			name[i]=sc.nextLine();
			++i;
		}	
		public void showInfo() 
		{
			System.out.println("rollno\tname\tcity\tmob");
			System.out.println("-----------------------------------------");
			for(int k=0;k<i;++k);
			{
				System.out.println(rollno[k]+"\t"+name[k]"\t"+city[k]"\t"+mob[k]"\t");
			}
		}
		public void updateData()
		{

		}
		public void deleteData()
		{

		}
		class infoarray
		{
			public static void main(String[] args) 
			{
				Student s=new Student();
				while(true)
				{
					System.out.println("1. Input Data ");
					System.out.println("2. ShowInfo ");
					System.out.println("3. updateData ");
					System.out.println("4. deleteData ");
					System.out.println("5. signout ");
					System.out.println("Select any choice");
				}	
			}
		}
	}
}