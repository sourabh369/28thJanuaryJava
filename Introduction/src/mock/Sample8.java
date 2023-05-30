package mock;

public class Sample8 
{

	public static void main(String[] args) 
	{
	
		String org="Sourabh123";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println(rev.charAt(0));
		System.out.println(rev.charAt(1));
		System.out.println(rev.charAt(2));
		
	}
	
}
