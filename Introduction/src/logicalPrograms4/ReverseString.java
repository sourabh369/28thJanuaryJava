package logicalPrograms4;

public class ReverseString 
{

	public static void main(String[] args) 
	{
	
		String s1="My name is Sourabh";
		String arr[] = s1.split(" ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			String org=arr[i];
			String rev="";
			for(int j=org.length()-1;j>=0;j--)
			{
				rev=rev+org.charAt(j);
			}
			System.out.print(rev + " ");
		}
			
	}
	
}
