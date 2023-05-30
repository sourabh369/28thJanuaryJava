package arraysexample;

import java.util.Arrays;

public class Sample18 
{

	public static void main(String[] args) 
	{
	
		int arr[] = new int[4];
		arr[0]=10;
		arr[1]=90;
		arr[2]=30;
		arr[3]=50;
		
		System.out.println(arr[2]);
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
		
		System.out.println("-----Print array in ascending order-----");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("-----Print array in descending order-----");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}
	
}
