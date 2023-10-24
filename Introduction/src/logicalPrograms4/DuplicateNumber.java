package logicalPrograms4;

public class DuplicateNumber 
{

	public static void main(String[] args) 
	{
	
		int arr1[] = {10 , 60 , 80 , 50};
		int arr2[] = {10 , 70 , 40 , 50};
		
		for(int i=0;i<=3;i++)
		{
			if(arr1[i]==arr2[i])
			{
				System.out.println(arr1[i] + " " + arr2[i]);
			}
		}
		
	}
	
}
