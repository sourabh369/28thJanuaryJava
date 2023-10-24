package logicalPrograms3;

public class StringToChar 
{

	public static void main(String[] args) 
	{
	
		String s1="Sourabh rane";
		char c;
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			c = s1.charAt(i);
			System.out.println("Character at index " + i + " is " + c);
		}
	}
	
}
