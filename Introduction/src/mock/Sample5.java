package mock;

public class Sample5 
{

	public static void main(String[] args) 
	{
	
		String org="This is an interview";
		
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		
	}
	
}
