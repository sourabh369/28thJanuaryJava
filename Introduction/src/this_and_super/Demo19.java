package this_and_super;

public class Demo19 extends Demo18
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
	
		Demo19 d19 = new Demo19();
		d19.info();
	}
	
}
