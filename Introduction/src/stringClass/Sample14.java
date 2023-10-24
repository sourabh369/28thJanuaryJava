package stringClass;

public class Sample14 
{

	public static void main(String[] args) 
	{
	
		String s1="abc";
		String s2="ABC";
		String s3="This is a statement";
		
		System.out.println(s1.length());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("a"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.isEmpty());
		System.out.println(s3.indexOf("a"));
		System.out.println(s3.lastIndexOf("t"));
		System.out.println(s1.startsWith("a"));
		System.out.println(s2.endsWith("t"));
		System.out.println(s1.concat(s2));
		System.out.println(s3.substring(5));
		System.out.println(s3.replace("t", "T"));
	}
	
}
