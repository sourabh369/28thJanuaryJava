package logicalprograms;

public class ArraySortingasc 
{

	public static void main(String[] args) 
	{
	
		int temp;
		int arr[]= {10 , 20 , 5 , 3 , 80 , 40};
		
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
