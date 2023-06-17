package logicalPrograms1;

public class PrimeNumber1 
{

	public static void main(String[] args) 
	{
	
		boolean flag=false;
		int value=7;
		
		for(int i=2;i<value/2;i++)
		{
			if(value%2==0)
			{
				flag=true;
			}
		}
		
		if(flag)
		{
			System.out.println("Given no is not prime");
		}
		else 
		{
			System.out.println("Given no is prime");
		}
	}
	
}
