package logicalprograms;

public class Swappingofnumbers1 
{

	public static void main(String[] args) 
	{
	
	    int num1=10;
	    int num2=6;
	    int temp;
	    
	    System.out.println("Numbers before swapping using 3rd variable are " + num1 + " and " +num2);
		 
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("Numbers after swapping using 3rd variable are " + num1 + " and " +num2);
		
		int a=90;
		int b=33;
		
		System.out.println("Numbers before swapping without using 3rd variable are " + a + " and " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Numbers after swapping without using 3rd variable are " + a + " and " +b);
	}
	
}
