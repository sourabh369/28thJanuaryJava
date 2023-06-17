package logicalPrograms1;

public class LargestNumberFrom4nos 
{

	public static void main(String[] args) 
	{
	
		int num1=50;
		int num2=30;
		int num3=80;
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("Num1 is greater");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Num2 is greater");
		}
		else
		{
			System.out.println("Num3 is greater");
		}
		
	}
	
}
