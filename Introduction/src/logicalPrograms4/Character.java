package logicalPrograms4;

public class Character 
{

	public static void main(String[] args) 
	{
	
		String s="My name is Sourabh";
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)!=0)
			{
				count++;
			}
		}
		System.out.println(count);	
	}
}
