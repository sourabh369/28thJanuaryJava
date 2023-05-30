package logicalprograms;

public class Swappingnumbers 
{

	public static void main(String[] args) 
	{
	
		int num1=10;
		int num2=20;   //10
		int temp;
		
		System.out.println("Before swapping " + num1 + " " + num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping " + num1 + " " + num2);
        int a=10;    //20
        int b=20;    //10
        System.out.println("Before swapping " + a + " " + b);
        a=a+b;    //30
        b=a-b;    //10
        a=a-b;    //30-10
        System.out.println("After swapping without 3rd variable " + a + " " + b);
	}
	
}
