package logicalprograms;

public class charcount 
{

	public static void main(String[] args) 
	{
	
		String s1="My name is Sourabh Rane";
		int count=0;
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			if(s1.charAt(i)!=0)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
	
}
