package logicalPrograms2;

public class Swapping 
{

	public static void main(String[] args) 
	{
	
		int num1=60;
		int num2=30;
		int temp;
		System.out.println("Number before swapping using 3rd variable are " + num1 + " and " +num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Number after swapping using 3rd variable are " + num1 + " and " +num2);
		
		int a=9;
		int b=4;
		System.out.println("Number before swapping without using 3rd variable are " + a + " and " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number after swapping without using 3rd variable are " + a + " and " +b);
	}
	
}
