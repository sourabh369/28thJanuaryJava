package logicalprograms;

public class Palindrome 
{

	public static void main(String[] args) 
	{
	
		String org="bob";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev = rev + org.charAt(i);
		}
		System.out.println("original string is "+org);
		System.out.println("Reverse string is "+rev);
		
		if(rev.equalsIgnoreCase(org))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
		
	}
	
}
