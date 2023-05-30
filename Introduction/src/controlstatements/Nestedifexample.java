package controlstatements;

public class Nestedifexample {

	public static void main(String[] args) {
		int SA = 600;
		
//		   600>=500
		if(SA>=500)
		{
			if(SA>=10000)
			{
				System.out.println("Additional discount");
			}
			else
			{
				System.out.println("No discount");
			}
		}
		else
		{
			System.out.println("You have to shipping charges");
		}
		
	}
	
}
