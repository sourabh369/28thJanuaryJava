package logicalprograms;

public class ReverseStringwithoutchangingposition 
{

	public static void main(String[] args) 
	{
	
		String org="Sourabh rane";
		String arr[] = org.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i].length() - 1;j>=0;j--)
			{
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
		
		
	}
	
}
