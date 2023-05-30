package controlstatements;

public class Sample10 
{

	public static void main(String[] args) 
	{
	
		int marks=65;
		
		if(marks<=100 && marks>=60)
		{
			System.out.println("Distinction");
		}
		else if(marks<=59 && marks>=50)
		{
			System.out.println("First class");
		}
		else if(marks<=49 && marks>=40)
		{
			System.out.println("Second class");
		}
		else
		{
			System.out.println("Fail");
		}
			
		
		
	}
	
}
