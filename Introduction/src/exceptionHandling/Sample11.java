package exceptionHandling;

public class Sample11 
{

	public static void main(String[] args) 
	{
	
//		int arr[]= {10 , 60 , 30};
		String s1="abc";
		
		
		try
		{
			System.out.println(s1.charAt(5));
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
			System.out.println("Generic exception handled");
		}
		
		
	}
	
}
