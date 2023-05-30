package exceptionHandling;

public class Sample12 
{

	public static void main(String[] args) 
	{
	
		int arr[] = {10 , 60 , 20};
		
		try
		{
			System.out.println(arr[5]);
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
			System.out.println("Exception handled");
		}
		
		
	}
	
}
