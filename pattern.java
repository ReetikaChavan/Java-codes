// 1111
// 2222
// 3333
// 4444


// class pattern
// {
// 	public static void main(String[] args) 
// 	{
// 		for(int i=1;i<=4;++i)
// 		{
// 			for(int j=1;j<=4;++j)
// 			{
// 				System.out.print(i);

// 			}
// 			System.out.println();
// 		}	
// 	}
// }



// 1
// 12
// 123
// 1234

// class pattern
// {
// 	public static void main(String[] args) 
// 	{
// 		for(int i=1;i<=4;++i)
// 		{
// 			for(int j=1;j<=i;++j)
// 			{
// 				System.out.print(j);
// 			}
// 			System.out.println();
// 		}
// 	}
// }


// 1234
// 5678
// 9101112
// 13141516


class pattern {
    public static void main(String[] args) 
    {
        int counter = 1;
        for (int i=1;i<=4;++i) 
        {
            for (int j=1;j<=i*4; ++j) 
            {
                System.out.print(counter++ +" ");
            }
            System.out.println();
        }
    }
}





