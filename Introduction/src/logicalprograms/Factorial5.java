package logicalprograms;

public class Factorial5 
{

	public static void main(String[] args) 
	{
	
		int num=4;
		int fact=1;
		
		for(int i=num;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
	
}
