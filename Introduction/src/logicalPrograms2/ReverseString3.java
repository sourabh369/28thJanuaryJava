package logicalPrograms2;

public class ReverseString3 
{

	public static void main(String[] args) 
	{
	
		String s1 = "Sourabh rane";
		String arr[] = s1.split(" ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String org= arr[i];
			String rev= reverseString(org);
			System.out.println(rev);
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
