package logicalPrograms3;

public class ReverseString1 
{

	public static void main(String[] args) 
	{
	
		String s1="My name is abc";
		String arr[] = s1.split(" ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String org = arr[i];
			if(i%2==0)
			{
				String rev=reverseString(org);
				System.out.print(rev + " ");
			}
			else
			{
				System.out.print(org + " ");
			}
		}
		
	}
	
	public static String reverseString(String org)
	{
	
		String rev="";
		for(int j=org.length()-1;j>=0;j--)
		{
			rev=rev+org.charAt(j);
		}
		return rev;
	}
	
}
