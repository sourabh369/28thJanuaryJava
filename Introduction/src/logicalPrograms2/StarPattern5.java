package logicalPrograms2;

public class StarPattern5 
{

	public static void main(String[] args) 
	{
	
		//    *
		//   **
		//  ***
		// ****
		//*****
		int star=1;
		int space=4;
		for(int i=1;i<=5;i++)
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
		System.out.println();
		//****
		// ***
		//  **
		//   *
		
		int star1=5;
		int space1=0;
		for(int i=1;i<=5;i++)
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
