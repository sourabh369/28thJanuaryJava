package constructor;

public class Sample21 
{

	String sname;
	int age;
	
	Sample21()
	{
		sname="Sourabh";
		age=30;
	}
	
	public void info()
	{
	   System.out.println("Name is " + sname + " age is " + age);	
	}
	
	public static void main(String[] args) 
	{
	
		Sample21 s21 = new Sample21();
		s21.info();
		
	}
	
}
;