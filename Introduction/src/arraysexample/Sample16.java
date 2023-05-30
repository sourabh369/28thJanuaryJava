package arraysexample;

import java.util.Arrays;

public class Sample16 
{

	public static void main(String[] args) 
	{
	
		String str[] = new String[4];
		str[0]="Ramesh";
		str[1]="Suresh";
		str[2]="Ganesh";
		str[3]="Mahesh";
		
		System.out.println(str[1]);
		System.out.println(str.length);
		
		System.out.println("----Print array in normal order---");
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.println(str[i]);
		}
		
		System.out.println("----Print array in reverse order---");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
		
		Arrays.sort(str);
		
		System.out.println("----Print array in ascending order---");
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.println(str[i]);
		}
		
		System.out.println("----Print array in descending order---");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}
		
	}
	
}
