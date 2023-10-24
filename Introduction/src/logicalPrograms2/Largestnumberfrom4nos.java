package logicalPrograms2;

public class Largestnumberfrom4nos 
{

	public static void main(String[] args) 
	{
	
		int num1=50;
		int num2=12;
		int num3=200;
		int num4=53;
		
		if(num1>num2 && num1>num3 && num1>num4)
		{
			System.out.println("Num1 is greater");
		}
		else if(num2>num1 && num2>num3 && num2>num4)
		{
			System.out.println("num2 is greater");
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
