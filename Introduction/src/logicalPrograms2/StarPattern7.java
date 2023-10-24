package logicalPrograms2;

public class StarPattern7 
{

	public static void main(String[] args) 
	{
		
		//     *
		//    * *
		//   * * *
		//  * * * *
		// * * * * *
		//* * * * * *
		
		int star=1;
		int space=5;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}
		System.out.println();
		int star1=6;
		int space1=0;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=star1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star1--;
			space1++;
		}
		
	}
	
}
