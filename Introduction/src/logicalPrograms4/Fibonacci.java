package logicalPrograms4;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
	
		int num1=0;
		int num2=1;
		System.out.print(num1 + " " + num2 + " ");
		int num3=2;
		for(int i=num3;i<=10;i++)
		{
			num3=num1+num2;
			System.out.print(num3 + " ");
			num1=num2;
			num2=num3;
		}
	}
	
}
