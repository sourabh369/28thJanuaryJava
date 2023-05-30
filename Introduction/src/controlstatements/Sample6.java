package controlstatements;

public class Sample6 
{

	public static void main(String[] args) 
	{
	
		int SA = 520;
		int TA = 910;
		
		if(SA>=500)
		{
			System.out.println("Eligible for free delivery");
			if(TA>=1000)
			{
				System.out.println("Additional 10% discount");
			}
			else
			{
				System.out.println("No discount");
			}
		}
		else
		{
			System.out.println("You have to pay additional 50rs");
		}
		
	}
	
}
