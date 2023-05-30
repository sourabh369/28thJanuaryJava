package controlstatements;

public class Sample_ifelse {

	public static void main(String[] args) {
		int marks = 30;
		
		if(marks>=65)
		{
			System.out.println("Congratulations you have scored Distinction");
		}
		else if(marks>=60 && marks<65) 
		{
			System.out.println("Congratulations you have scored First class");
		}
		else if(marks>=55 && marks<60) 
		{
			System.out.println("Congratulations you have scored Higher Second class");
		}
		else if(marks>=50 && marks<55) 
		{
			System.out.println("Congratulations you have scored Second class");
		}
		else if(marks>=35 && marks<50) 
		{
			System.out.println("Congratulations you have scored Pass class");
		}
		else
		{
			System.out.println("Result is Fail");
		}
	}
	
}
