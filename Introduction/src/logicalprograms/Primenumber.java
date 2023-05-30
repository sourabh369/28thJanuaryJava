package logicalprograms;

public class Primenumber 
{

	public static void main(String[] args) 
	{
	
		boolean flag=false;
		int value=10;
		
		for(int i=1;i<=value/2;i++)
		{
			if(value%2==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("Given number is prime");
		}
		
	}
	
}
