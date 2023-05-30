package logicalprograms;

public class Starpattern7 
{

	public static void main(String[] args) 
	{
	
		int star=1;

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star = star+2;
		}
		
		int star1=7;

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=star1;j++)	
			{
				System.out.print("*");
			}
			System.out.println();
			star1 = star1-2;
		}
		
	}
	
}
