package logicalPrograms3;

public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{
	
		int orgNum=189;
		int sum=0;
		
		for(int i=orgNum;i>0;i=i/10)
		{
			int rem=i%10;
			sum = sum + (rem*rem*rem);
		}
		
		if(orgNum==sum)
		{
			System.out.println("Given number is armstrong number");
		}
		else
		{
			System.out.println("Given number is not a armstrong number");
		}
		
		
	}
	
}
