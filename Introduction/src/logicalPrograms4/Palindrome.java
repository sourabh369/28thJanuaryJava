package logicalPrograms4;

public class Palindrome 
{

	public static void main(String[] args) 
	{
	
		String org="Nitin";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		
		if (org.equalsIgnoreCase(rev))
		{
			System.out.println("Given string is palindrome");
		}
		else 
		{
			System.out.println("Given String is not palindrome");
		}
	}
	
}
