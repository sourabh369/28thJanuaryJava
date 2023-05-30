package constructor;

public class Sample28 
{

	String sname;
	int age;
	
	Sample28(String i , int j)
	{
		sname=i;
		age=j;
	}
	
	public void info()
	{
	   System.out.println("name of the employee is " + sname + " age of the employee is " + age);	
	}
	
	public static void main(String[] args) 
	{
	
		Sample28 s28 = new Sample28("Sourabh", 30);
		s28.info();
		
		
	}
	
}
