package controlstatements;

public class Sample5 
{

	public static void main(String[] args) 
	{
	
		int marks = 60;
		
		if(marks<=100 & marks>=60)
		{
		  System.out.println("Distinction");	
		}
		else if(marks<=59 & marks>=50)
		{
			System.out.println("First class");
		}
		else if(marks<=49 & marks>=40)
		{
			System.out.println("Second class");
		}
		else if(marks<=39 & marks>=35)
		{
			System.out.println("Pass class");
		}
		else
		{
			System.out.println("Failed");
		}
		
	}
	
}
