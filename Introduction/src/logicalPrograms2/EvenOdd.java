package logicalPrograms2;

public class EvenOdd 
{

	public static void main(String[] args) 
	{
	
//		int num=5;
//		
//		if(num%2==0)
//		{
//			System.out.println("Given no is even");
//		}
//		else
//		{
//			System.out.println("Given no is odd");
//		}
		
//		System.out.println(100 + 100 + "Test");   
//        System.out.println("Test" + 100 + 100); 
		
int tem=0;
		
		for(int i=10;i<20;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					tem=tem+1;
				}
			}
			if(tem==0)
			{
				System.out.print(i+",");
			}
			else
			{
				tem=0;
			}

		}
		System.out.println("");
		
	}
	
}
