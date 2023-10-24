package exceptionHandling;

public class Sample17 
{

	public static void main(String[] args) 
	{
	
		int arr[]= {10 , 60 ,20};
		
		try
		{
			System.out.println(arr[6]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		
		System.out.println("hi");
		
	}
	
}
