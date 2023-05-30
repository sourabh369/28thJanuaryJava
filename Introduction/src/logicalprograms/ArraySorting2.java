package logicalprograms;

public class ArraySorting2 
{

	public static void main(String[] args) 
	{
	
		int arr[] = {10 , 60 , 23 , 90 , 56 , 800};
		int temp;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i] > arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
		
		
		
	}
	
	

}
