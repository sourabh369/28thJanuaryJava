package logicalPrograms1;

public class ReverseString 
{

	public static void main(String[] args) 
	{
	
		String org="Sourabh Rane";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		
		if (rev.equalsIgnoreCase(org))
		{
			System.out.println("Given string is palindrome");
		} 
		else 
		{
			System.out.println("Given string is not a palindrome");
		}
		
		
		
	}
	
	
}
