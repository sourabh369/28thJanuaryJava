package logicalPrograms3;

public class DuplicateNumber 
{

	public static void main(String[] args) 
	{
	
		int arr[] = {10 , 60 , 50 , 200 , 60 , 90 , 50 , 10};
//		int arr2[] = {10 , 80 , 70 , 200};
//		
//		for(int i=0;i<=3;i++)
//		{
//			if(arr1[i]==arr2[i])
//			{
//				System.out.println(arr1[i] + " " + arr2[i]);
//			}
//		}
			
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
		
	}
	
}
