package logicalPrograms2;

public class CharacterCount 
{

	public static void main(String[] args) 
	{
	
		int count=0;
		String s1="Rane";
		
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
