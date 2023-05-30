package controlstatements;

public class nestedif {
	
	public static void main(String[] args) {
		int SA = 100;
		
		if(SA>=500)
		{
			System.out.println("No delivery charges");
			if(SA>=10000)
			{
				System.out.println("You are eligible for extra 10% discount");
			}
			else
			{
				System.out.println("No Discount applicable");
			}
		}
		else
		{
			System.out.println("You have to pay 50 Rs delivery fee");
		}
	}

}
