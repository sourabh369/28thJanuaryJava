package logicalPrograms2;

public class DuplicateNumberInArray 
{

	public static void main(String[] args) 
	{
	
//		int arr[] = {10 , 60 , 10 , 90 , 60 , 90 , 23};
		String arr[] = {"Sourabh" , "Ankita" , "Tanay" ,"Sourabh" ,"Ankita" , "Subhash" , "Sourabh" , "Tanay" };
		
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
		System.out.println("----------------");
		int arr1[]= {10 , 60 , 90 , 200};
		int arr2[]= {12 , 60 , 90 , 20};
		
		for(int i=0;i<=3;i++)
		{
			if(arr1[i]==arr2[i])
			{
				System.out.println(arr1[i] + " " + arr2[i]);
			}
		}
		
	}
	
}
