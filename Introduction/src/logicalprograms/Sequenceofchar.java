package logicalprograms;

public class Sequenceofchar 
{

	public static void main(String[] args) 
	{
	
		String s1="abc";
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c = s1.charAt(i);
			{
			  System.out.println("char at " + i + " index is " +c);	
			}
		}
		
	}
	
}
