package stringClass;

public class Sample12 
{

	public static void main(String[] args) 
	{
	
		String s1="abc";
		String s2="ABC";
		String s3="This is a statement";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("a"));
		System.out.println(s1.charAt(2));
		System.out.println(s1.isEmpty());
		System.out.println(s1.startsWith("A"));
		System.out.println(s1.endsWith("c"));
		System.out.println(s1.replace("a", "A"));
		System.out.println(s3.substring(3));
		System.out.println(s3.substring(5, 10));
		System.out.println(s1.concat(s2));
	}
	
	
	
}
