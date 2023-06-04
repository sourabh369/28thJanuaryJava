package exceptionHandling;

public class Sample15 
{

	public static void main(String[] args)
	{
	
		int arr[] = {10 , 60 , 20};
		
		try
		{
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(Exception e)
		{
			System.out.println("Generic exception handled");
		}
		
	}
	
	
	
}
