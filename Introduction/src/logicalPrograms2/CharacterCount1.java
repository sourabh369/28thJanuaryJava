package logicalPrograms2;

public class CharacterCount1 
{

	public static void main(String[] args) 
	{
	
		String s1="Sourabh";
		int count = 0;
		
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
