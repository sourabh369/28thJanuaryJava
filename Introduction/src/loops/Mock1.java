package loops;

public class Mock1 {
	
	public static void main(String[] args) {
		
		boolean flag = false;
		int value = 3;
		
		for(int i =2; i<=value/2;i++)
		{
			if(value%i==0)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("Number is prime");
		}
		
	}

}
