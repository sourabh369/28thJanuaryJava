package exceptionHandling;

public class Sample5 
{

	public static void main(String[] args)
	{
	
		int arr[] = {10	, 20 , 5 , 40};
		
		try
		{
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index OutOfBounds Exception handled");
		}
		
		System.out.println("Hi");
		
		
	}
	
}
