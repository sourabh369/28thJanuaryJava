package logicalPrograms1;

public class CharacterCount1 
{

	public static void main(String[] args) 
	{
	
		String s1="My name is Sourabh";
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
