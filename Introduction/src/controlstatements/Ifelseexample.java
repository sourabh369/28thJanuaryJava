package controlstatements;

public class Ifelseexample {
	
	public static void main(String[] args) {
		
		int marks =  55;
		
		if(marks < 75 & marks>=60)
		{
			System.out.println("You have got distinction");
		}
		else if(marks> 50 & marks<=59)
		{
			System.out.println("You have got first");
		}
		else if(marks> 40 & marks<=49)
		{
			System.out.println("You have got second");
		}
		else if(marks> 35 & marks<=39)
		{
			System.out.println("You have got distinction");
		}
		else
		{
			System.out.println("You are failed");
		}
		
	}

}
