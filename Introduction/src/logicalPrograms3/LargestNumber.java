package logicalPrograms3;

public class LargestNumber 
{

	public static void main(String[] args) 
	{
	
		int num1=100000;
		int num2=50000;
		int num3=1500;
		int num4=500;
		
		if(num1>num2 && num1>num3 && num1>num4)
		{
			System.out.println("Num1 is greater");
		}
		else if(num2>num1 && num2>num3 && num2>num4)
		{
			System.out.println("Num2 is greater");
		}
		else if(num3>num1 && num3>num2 && num3>num4)
		{
			System.out.println("Num3 is greater");
		}
		else
		{
			System.out.println("Num4 is greater");
		}
		
	}
	
}
