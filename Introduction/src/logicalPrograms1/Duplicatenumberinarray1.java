package logicalPrograms1;

public class Duplicatenumberinarray1 
{

	public static void main(String[] args) 
	{
	
		int arr1[]= {10 , 60 , 90 , 200};
		int arr2[]= {10 , 70 , 80 , 200};
		
		for(int i=0;i<=3;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				System.out.println(arr1[i] + " " + arr2[i]);
			}
		}
		
	}
	
}
