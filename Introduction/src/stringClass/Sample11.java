package stringClass;

public class Sample11 
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
		System.out.println(s1.charAt(2));
		System.out.println(s1.isEmpty());
		System.out.println(s1.startsWith("A"));
		System.out.println(s2.endsWith("C"));
		System.out.println(s1.concat(s2));
		System.out.println(s1.replace("a", "A"));
		
		
		String s3="This is a statment";
		String s4[] = s3.split("");
		System.out.println(s4[8]);
		
		
		String s5 = new String("abc");
		System.out.println(s1!=s5);
		
		String s6 = "abc";
		System.out.println(s1==s6);
		
	}
	
	
}
