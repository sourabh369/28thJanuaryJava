package exceptionHandling;

public class Sample14 
{

	public static void main(String[] args) 
	{
	
		int arr[] = {10 , 60 , 20};
		
		try
		{
			System.out.println(arr[9]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		
	}
	
	
}
