package stringClass;

public class Sample8 
{

	public static void main(String[] args) 
	{
	
		String s1="abc";
		String s2="ABC";
		String s3="";
		String s4="This is a statement";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("b"));
		System.out.println(s3.isEmpty());
		System.out.println(s1.charAt(2));
		System.out.println(s1.startsWith("v"));
		System.out.println(s1.endsWith("d"));
		System.out.println(s4.substring(5, 9));
		System.out.println(s1.concat(s2));
		System.out.println(s1.replace("a", "A"));
		
		
	}
	
}
