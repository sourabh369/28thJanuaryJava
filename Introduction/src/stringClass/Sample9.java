package stringClass;

public class Sample9 
{

	public static void main(String[] args) 
	{
	
		String s1="abc";
		String s2="ABC";
		String s3="This is a statement";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals(s2));    //checks information and case
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("a"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(2));
		System.out.println(s1.startsWith("A"));
		System.out.println(s2.endsWith("D"));
		System.out.println(s3.substring(3));
		System.out.println(s3.substring(4, 10));
		System.out.println(s1.concat(s2));
		System.out.println(s1.replace("a", "A"));
		
		
	}
	
}
