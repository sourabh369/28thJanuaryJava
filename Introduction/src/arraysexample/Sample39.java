package arraysexample;

import java.util.Arrays;

public class Sample39 
{

	public static void main(String[] args) 
	{
	
		String arr[] = {"Sourabh" , "Ankita" , "Tanay"};
		
		System.out.println(arr[0]);
		System.out.println(arr.length);

		System.out.println("-----Print array in normal order-----");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("-----Print array in reverse order-----");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println("-----Print array in normal order-----");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("-----Print array in reverse order-----");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("------------");
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		
	}
	
}
