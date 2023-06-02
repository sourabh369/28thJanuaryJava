package logicalPrograms1;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
	
		boolean flag=false;
		int val=3;
		
		for(int i=2;i<=val/2;i++)
		{
			if(val%2==0)
			{
				flag=true;
				break;
			}
		}
		
		if (flag)
		{
			System.out.println("Given number is not prime");
		} 
		else 
		{
			System.out.println("Given number is prime");
		}
		
		
		
	}
	
	
	
}
