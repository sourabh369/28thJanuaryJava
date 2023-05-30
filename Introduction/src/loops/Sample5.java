package loops;

public class Sample5 
{

	public static void main(String[] args) 
	{
	
		for(int i=1;i<=10;i=i+2)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		int i=1;   //initial condition
		
		while(i<=10)  //last condition
		{
			System.out.println(i);   //printing statement
			i=i+2;  				 // increment or decrement
		}
		
		
	}
	
}
