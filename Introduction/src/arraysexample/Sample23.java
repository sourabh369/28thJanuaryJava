package arraysexample;

import java.util.Arrays;

public class Sample23 
{

	public static void main(String[] args) 
	{
	
		String arr[] = new String[3];
		arr[0]="Sourabh";
		arr[1]="Ankita";
		arr[2]="Tanay";
		
		System.out.println(arr[0]);
		System.out.println(arr.length);
		
		System.out.println("----Print normal array---");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("----Print reverse array---");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println("----Print ascending order array---");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("----Print descending order array---");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}
	
}
