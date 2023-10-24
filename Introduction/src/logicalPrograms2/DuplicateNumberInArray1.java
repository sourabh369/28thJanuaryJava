package logicalPrograms2;

public class DuplicateNumberInArray1 
{

	public static void main(String[] args) 
	{
	
		int arr1[] = {10 , 60 , 90 , 500};
		int arr2[] = {10 , 40 , 50 , 500};
		
		for(int i=0;i<=3;i++)
		{
			if(arr1[i]==arr2[i])
			{
				System.out.println(arr1[i] + " " + arr2[i]);
			}
		}
		
	}
	
}
