package logicalPrograms3;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
	
		int orgNum=6987;
		int rev=0;
		
		for(int i=orgNum;i>0;i=i/10)
		{
			int rem=i%10;
			rev = rev*10 + rem;
		}
		System.out.println(rev);
	}
	
}
