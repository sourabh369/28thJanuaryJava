package logicalPrograms2;

public class ArmStrongNumber 
{

	public static void main(String[] args) 
	{
	
		int num=153;
		int sum=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			sum = sum + (rem*rem*rem);
		}
		System.out.println(sum);
		
		
		if(num == sum)
		{
			System.out.println("Given number " + num + " is armstrong number");
		}
		else
		{
			System.out.println("Given number " + num + " is not armstrong number");
		}
	}
	
}
