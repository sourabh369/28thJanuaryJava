package arraysexample;

public class Sample2 
{

	public static void main(String[] args) 
	{
	    //array declaration
		String arr [] = new String[3];
		
		//array initialization
		arr[0]="Rahul";
		arr[1]="Suresh";
		arr[2]="Ramesh";
		
		System.out.println(arr[2]);
		System.out.println(arr.length);
		System.out.println("----Print normal array----");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("----Print reverse array----");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}
	
}
