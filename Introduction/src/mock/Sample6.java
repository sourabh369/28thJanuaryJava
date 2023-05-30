package mock;

public class Sample6 extends Sample7
{

	int i=10;
	
	public void info()
	{
		int i=20;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
	public static void main(String[] args)
	{
	
		Sample6 s6 = new Sample6();
		s6.info();
	}
	
}
