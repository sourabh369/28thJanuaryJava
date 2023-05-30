package logicalprograms;

public class Duplicatevalueinarray 
{

	public static void main(String[] args) 
	{
	
		int arr1[] = {10 , 60 , 90 , 200};
		int arr2[] = {70 , 60 , 90 , 500};
		
		for(int i=0;i<=3;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				System.out.println(arr1[i]);
				System.out.println(arr2[i]);
			}
		}
		
	}
	
}
