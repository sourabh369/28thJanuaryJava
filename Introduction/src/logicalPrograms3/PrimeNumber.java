package logicalPrograms3;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
	
		boolean flag=false;
		int num=7;
		
		for(int i=num;i>=num/2;i++)
		{
			if(num%2==0)
			{
				flag=true;
			}
		}
		
		if(flag)
		{
			System.out.println("Given number is not prime");
		}
		else
		{
			System.out.println("Given number is prime");
		}
		
	}
	
}
