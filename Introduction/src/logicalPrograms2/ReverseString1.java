package logicalPrograms2;

import java.util.Scanner;

public class ReverseString1 
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
		System.out.println("-----------------");
		String name="Sourabh rane";
		String[] arr = name.split(" ");
		for(int i=0;i<=arr.length-1;i++)
		{
			String original = arr[i];
			String reverse = "";
			for(int j=original.length()-1;j>=0;j--)
			{
				reverse= reverse+original.charAt(j);
			}
			System.out.print(reverse);
		}
		System.out.println();
		System.out.println("-----------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		
		String s1=sc.next();
		String rev1="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev1=rev1+s1.charAt(i);
		}
		System.out.println(rev1);
		
//		String s1="my name is abc";    //op -> ym eman si cba
//
//
//		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
//
//		//           
//		for(int i=0; i<=ar.length-1; i++)      //0-3
//		{				// 3
//			String org = ar[i];  //my
//
//			String rev="";
//			for(int j=org.length()-1; j>=0; j--) 
//			{
//				rev=rev+org.charAt(j);
//			}
//
//			System.out.print(rev+" ");   //ym
//		}
	}
	
}
