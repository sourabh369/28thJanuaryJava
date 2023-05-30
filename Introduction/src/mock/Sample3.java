package mock;

public class Sample3 
{

	public static void main(String[] args) 
	{
	
		String s="#c2342^&^%a$pge452mini";
		System.out.println(s.replaceAll("[a-z]", "0"));
		System.out.println(s.replaceAll("[0-9]", "a"));
	}
	
}
