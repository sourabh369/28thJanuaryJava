package logicalprograms;

public class ReverseString4 
{

	public static void main(String[] args) 
	{
	
		String org="nitin";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(org))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
		
	}
	
}
