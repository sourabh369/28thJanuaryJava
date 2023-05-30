package arraysexample;

public class Sample1 
{

	public static void main(String[] args) 
	{
	    //array declaration
		int arr [] = new int[4];
		
		//array initialization
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 9;
		arr[3] = 6;
		
		System.out.println(arr[1]);
		System.out.println(arr[0]);
		System.out.println(arr.length);
		
		System.out.println("------Print array in normal order-----");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("------Print array in reverse order-----");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}
	
}
