package logicalPrograms2;

public class ArraySorting 
{

	public static void main(String[] args) 
	{
	
		int arr[] = {10 , 60 , 20 , 14 , 90 , 87 , 100 , 5};
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
