package stringClass;

public class Sample5 
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
		System.out.println(s1.contains("c"));
		System.out.println(s2.isEmpty());
		System.out.println(s1.charAt(1));
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.endsWith("C"));
		System.out.println(s3.substring(1));
		System.out.println(s3.substring(4, 9));
		System.out.println(s1.concat(s2));
		System.out.println(s3.replace("i", "0"));
		
	}
	
}
