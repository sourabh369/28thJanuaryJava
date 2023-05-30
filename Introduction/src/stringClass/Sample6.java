package stringClass;

public class Sample6 
{

	public static void main(String[] args) 
	{
	
		String s1="abc";
		String s2="ABC";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("A"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(2));
		System.out.println(s1.startsWith("a"));
		System.out.println(s2.endsWith("c"));
		System.out.println(s1.substring(1));
		System.out.println(s1.concat(s2));
		System.out.println(s1.replace("a", "0"));
		
	}
	
}
