package exceptionHandling;

public class Sample4 
{

	public static void main(String[] args) 
	{
	
		int arr[]= {10 , 50 , 20};
		
		try
		{
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e)
		{
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		
		System.out.println("Hello");
		
	}
	
}
