package logicalprograms;

public class Reversenumber1 
{

	public static void main(String[] args)
	{
	
		int num=9657;
		int rev=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10 + rem;
		}
		System.out.println(rev);
		
	}
	
}
