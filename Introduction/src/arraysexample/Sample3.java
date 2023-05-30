package arraysexample;

public class Sample3 
{

	public static void main(String[] args) 
	{
	
		int arr[] = {10 , 20 , 30};
		
		//array initialization
		arr[0]=1;
		arr[1]=4;
		arr[2]=2;
		
		System.out.println(arr[1]);
		System.out.println(arr.length);
		System.out.println("---Print normal array---");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
}
