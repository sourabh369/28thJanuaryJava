package exceptionHandling;

public class Sample3 
{

	public static void main(String[] args) 
	{
	
		int num1=10;
		int num2=0;
		
		
		try
		{
			int div=num1/num2;
			System.out.println(div);
		}
		catch(ArithmeticException e)
		{
			
		}
		
		System.out.println("Good night");
		
	}
	
}
