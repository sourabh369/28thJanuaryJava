package logicalPrograms2;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
	
		int num=7;
		boolean flag=false;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%2==0)
			{
				flag=true;
			}
		}
		
		if (flag)
		{
			System.out.println("Given no is not prime");
		}
		else
		{
			System.out.println("Given no is prime");
		}
		
	}
	
}
