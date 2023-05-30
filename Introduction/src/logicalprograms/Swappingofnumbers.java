package logicalprograms;

public class Swappingofnumbers 
{

	public static void main(String[] args) 
	{
	
		int num1=10;
		int num2=20;
		int temp;
		System.out.println("Numbers before swapping using third variable " + num1 + " and " + num2);
		
		
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Numbers after swapping using third variable " + num1 + " and " + num2);
		
		
		int a=5;
		int b=4;
		System.out.println("Numbers before swapping without third variable " + a + " and " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swapping without third variable " + a + " and " + b);
		
	}
	
}
