package exceptionHandling;

public class Sample2 
{

	public static void main(String[] args) 
	{
	
		int arr[] = {10 , 50 , 30};
		
		try
		{
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		}
		
		System.out.println("Hello");
		
	}
	
}
