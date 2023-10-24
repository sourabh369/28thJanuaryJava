package logicalPrograms2;

import java.util.Scanner;

public class ReverseNumber1 
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		int rev =0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			rev = rev*10 + rem;
		}
		System.out.println(rev);
	}
	
}
