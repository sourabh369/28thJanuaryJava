package mock;

public class Sample9 
{

	public static void main(String[] args)
	{
	
		String s="78$5$^&6*7%21$790nsygeCDFSG";
		s=s.replaceAll("[^a-zA-Z0-9]*", "");
		System.out.println(s);
	}
	
}
