package logicalPrograms3;

public class PrintStatementInReverseOrder
{

	public static void main(String[] args) 
	{
	
		String s1= "My name is abc";
		String arr[] = s1.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println("---------------");
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
	
}
