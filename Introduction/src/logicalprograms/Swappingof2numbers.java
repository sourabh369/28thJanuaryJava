package logicalprograms;

public class Swappingof2numbers 
{

	public static void main(String[] args) 
	{
	
		int num1=10;
		int num2=20;
		int temp;
		System.out.println("Numbers before swapping with 3rd variable are " + num1 + " and " + num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("Numbers after swapping with 3rd variable are " + num1 + " and " + num2);
		
		int a=9;
		int b=18;
		System.out.println("Numbers before swapping without 3rd variable are " + a + " and " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swapping without 3rd variable are " + a + " and " + b);
		
	}
	
}
