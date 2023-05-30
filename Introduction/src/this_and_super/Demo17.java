package this_and_super;

public class Demo17 extends Demo16
{

	int a=10;
	
	public void info()
	{
	   int a=20;
	   System.out.println(a);
	   System.out.println(this.a);
	   System.out.println(super.i);
	}
	
	public static void main(String[] args) 
	{
	
		Demo17 d17 = new Demo17();
		d17.info();
		
	}
	
}
