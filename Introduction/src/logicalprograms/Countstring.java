package logicalprograms;

public class Countstring 
{

	public static void main(String[] args) 
	{
	
		String s1="This is a statement";
		int count=0;
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)!=0)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
	}
	
}
