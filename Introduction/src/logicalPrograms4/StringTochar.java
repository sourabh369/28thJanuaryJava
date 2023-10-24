package logicalPrograms4;

public class StringTochar 
{

	public static void main(String[] args) 
	{
	
		String s="Sourabh";
		char c;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			c=s.charAt(i);
			System.out.println("Character at index " + i + " is " +c);
		}
		
	}
	
}
