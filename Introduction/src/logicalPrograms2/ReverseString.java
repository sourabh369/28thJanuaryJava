package logicalPrograms2;

import java.util.Scanner;

public class ReverseString 
{

	public static void main(String[] args) 
	{
	
		String org="Sourabh rane";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		System.out.println("--------Reverse String in same position---------");
		String arr[] = org.split(" ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				System.out.print(arr[i].charAt(j) + " ");
			}
		}
		System.out.println();
		System.out.println("--------Reverse String using scanner---------");
		String rev1="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev1=rev1+str.charAt(i);
		}
		System.out.println(rev1);
	}
	
}
