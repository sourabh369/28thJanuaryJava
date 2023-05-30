package arraysexample;

public class Sample7 
{

	public static void main(String[] args) 
	{
	
		int arr [] = {10 , 50 , 70 , 30};
		int max = arr[0];  //10
		
		for(int i=0;i<arr.length-1;i++)
			
			if(arr[i]>max)
			{
				max = arr[i];
			}

			System.out.println("Largest number in given array " +max );
	}
	
}
