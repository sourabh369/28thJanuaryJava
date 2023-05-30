package loops;

//import java.util.Scanner;

public class Forloop4_printpalindrome {
	
	public static void main(String[] args) {
		
		String a = "baba" , b = "";
		char c;
		
		
		for(int i =0 ; i<a.length() ; i++)
		{
			c = a.charAt(i);
			b = c + b;
		}
		
		System.out.println("Reverse String is : " +b);
		
	}

}
