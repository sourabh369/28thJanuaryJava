package stringClass;

public class Sample7 
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
		System.out.println(s1.contains("a"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(2));
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.endsWith("f"));
		System.out.println(s1.substring(1));
		System.out.println(s1.concat(s2));
		System.out.println(s1.replace("a", "A"));
		
		String s3="My name is abc";       
		String[] s4= s3.split("");
		System.out.println(s4[6]);
		
		
	}
	
}
