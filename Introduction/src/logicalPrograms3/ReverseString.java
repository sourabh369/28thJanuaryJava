package logicalPrograms3;

public class ReverseString 
{

	public static void main(String[] args) 
	{
	
		String org="Sourabh rane";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev = rev + org.charAt(i);
		}
		System.out.println(org);
		System.out.println(rev);
		System.out.println("-----------");
		String s1[] = org.split(" ");
		for(int i=0;i<=s1.length-1;i++)
		{
			String org1 = s1[i];
			String rev1="";
			for(int j=org1.length()-1;j>=0;j--)
			{
				rev1=rev1+org1.charAt(j);
			}
			System.out.print(rev1 + " ");
		}
	}
	
}
