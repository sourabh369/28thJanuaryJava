package stringClass;

public class Sample4 
{

	public static void main(String[] args) 
	{
	
		String s1="abc";
		String s2="ABC";
		String s3=" ";
		String s4="This is a statement";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("a"));
		System.out.println(s3.isEmpty());
		System.out.println(s4.charAt(6));
		System.out.println(s4.startsWith("a"));
//		System.out.println(s4.startsWith("T", 0));
		System.out.println(s4.endsWith("t"));
		System.out.println(s4.substring(5));
		System.out.println(s4.substring(5, 10));
		System.out.println(s1.concat(s2));
		System.out.println(s4.replace("t", "0"));
		
		String s5="My name is abc";
		String[] s6 = s5.split("");
		System.out.println(s6[0]);
		
	}
	
}
