package logicalprograms;

public class Starpattern4 
{

	public static void main(String[] args) 
	{
	
		int star=1;

		//			5<=4
		for(int i=1;i<=4;i++)
		{
			//			1<=4
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");	 	
			}
			System.out.println();
			star++;     //5
		}
		
		int star1=4;

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star1--;
		}
		
//		int star2=4;
//
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=star2;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			star2--;
//		}
//		
//		int star3=1;
//
//		//			5<=4
//		for(int i=1;i<=4;i++)
//		{
//			//			1<=4
//			for(int j=1;j<=star3;j++)
//			{
//				System.out.print("*");	 	
//			}
//			System.out.println();
//			star3++;     //5
//		}
		
		
	}
	
}
