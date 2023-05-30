package controlstatements;

public class Nestedifexample1 {
	
	public static void main(String[] args) {
		
		int SA = 500;
		int TA = 1200;
		
		if(SA>=500)
		{
			System.out.println("Free delivery");
			if(TA>=1000)
			{
				System.out.println("Got 10% discount");
			}
			else
			{
				System.out.println("No additional discount");
			}
		}
		else
		{
			System.out.println("You have to pay delivery fee");
		}
		
	}

}
