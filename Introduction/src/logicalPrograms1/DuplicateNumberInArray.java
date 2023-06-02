package logicalPrograms1;

public class DuplicateNumberInArray 
{

	public static void main(String[] args) 
	{
	
		int arr1[] = {10 , 60 , 90 , 200};
		int arr2[] = {10 , 20 , 80 , 200};
		
		for(int i=0;i<=3;i++)
		{
			if(arr1[i]==arr2[i])
			{
				System.out.println(arr1[i] + " " + arr2[i]);
			}
		}
	}
	
	
}
