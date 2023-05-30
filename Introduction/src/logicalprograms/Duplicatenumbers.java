package logicalprograms;

public class Duplicatenumbers 
{

	public static void main(String[] args) 
	{
	
		int arr1[] = {10 , 20 , 50 , 100};
		int arr2[] = {10 , 20 , 70 , 100};
		
		for(int i=0;i<=3;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				System.out.println("Non duplicate numbers are " +arr1[i] + " " + arr2[i]);
			}
			else
			{
				System.out.println("Duplicate numbers are " + arr1[i] + " and " +arr2[i]);
			}
		}
		
	}
	
}
