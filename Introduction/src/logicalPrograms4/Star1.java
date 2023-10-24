package logicalPrograms4;

public class Star1 
{

	public static void main(String[] args) 
	{
	
		//   *
		//  **
		// ***
		//****
		
		int star=1;
		int space=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
		}
		
		//****
		// ***
		//  **
		//   *
		
		int star1=4;
		int space1=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star1--;
			space1++;
		}
		
	}
	
}
