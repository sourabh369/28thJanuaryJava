package loops;

public class Fact1 
{

	public static void main(String[] args) 
	{
	
		int num = 4;
		int fact = 1;
		
		         //4  4>=1
		for(int i=num;i>=1;i--)
		{
			fact = fact*i;   //4*3*2
		}
		System.out.println(fact);
		
	}
	
}
