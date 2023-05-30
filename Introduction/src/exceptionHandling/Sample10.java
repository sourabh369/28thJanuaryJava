package exceptionHandling;

public class Sample10 
{

	public static void main(String[] args) 
	{
	
		int arr[] = {10 , 60 , 90};
		String s1="abc";
		int num1=10;
		int num2=0;
		
		try
		{
			int c=num1/num2;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception handled");
		}
		
		System.out.println("Hello");
		
		
	}
	
}
