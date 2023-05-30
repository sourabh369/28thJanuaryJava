package logicalprograms;

public class Duplicatenumbers1 
{

	public static void main(String[] args) 
	{
	
		int arr1[]= {10 , 20 , 60 , 100};
		int arr2[]= {10 , 20 , 90 , 100};
		
		for(int i=0;i<=3;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				System.out.println(arr1[i] + " " + arr2[i]);
			}
		}
		
	}
	
}
