package logicalprograms;

public class ReverseString 
{

	public static void main(String[] args) 
	{
	
//		String original="nitin";
//		String reverse="";
//		
//		for(int i=original.length()-1;i>=0;i--)
//		{
//			reverse=reverse+original.charAt(i);
//		}
//		System.out.println("Original string is " + original);
//		System.out.println("Reverse string is " +reverse);
//		
//		if(reverse.equalsIgnoreCase(original))
//		{
//			System.out.println("Given string is palindrome");
//		}
//		else
//		{
//			System.out.println("Given string is not a palindrome");
//		}
		
		 String str = "Test the product";
		 String arr[] = str.split(" ");
		 for (int i = 0; i < arr.length; i++) {

		    for (int j = arr[i].length() - 1; j >= 0; j--) {
		        System.out.print(arr[i].charAt(j));
		    }
		    System.out.print(" ");
		
		 }
	}
	
}
