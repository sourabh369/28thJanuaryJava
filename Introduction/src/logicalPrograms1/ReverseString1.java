package logicalPrograms1;

public class ReverseString1 
{

	public static void main(String[] args) 
	{
	
		String s1="Sourabh rane";
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		
		String arr[]=s1.split(" ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				System.out.print(arr[i].charAt(j) + " ");
			}
		}
	}
	
}
