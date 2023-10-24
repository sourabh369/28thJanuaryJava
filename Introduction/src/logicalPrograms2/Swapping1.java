package logicalPrograms2;

public class Swapping1 
{

	public static void main(String[] args) 
	{
	
		int num1=90;
		int num2=54;
		int temp;
		System.out.println("Number before swapping using 3rd variable are " + num1 + " and " +num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Number after swapping using 3rd variable are " + num1 + " and " +num2);
		
		int a=5;
		int b=9;
		System.out.println("Number before swapping without using 3rd variable are " + a + " and " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number after swapping without using 3rd variable are " + a + " and " +b);
		
	}
	
}
