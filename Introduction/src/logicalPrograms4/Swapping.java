package logicalPrograms4;

public class Swapping 
{

	public static void main(String[] args) 
	{
	
		int num1=10;
		int num2=50;
		int temp;
		System.out.println("Numbers before swapping are " + num1 + " and  " + num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Numbers after swapping are " + num1 + " and  " + num2);
		
		int a=8;
		int b=2;
		System.out.println("Numbers before swapping are " + a + " and  " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swapping are " + a + " and  " + b);
	}
	
}
