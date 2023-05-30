package this_and_super;

public class Demo15 extends Demo16
{

	int i=10;
	
	public void m1()
	{
	   int i=20;
	   System.out.println(i);
	   System.out.println(this.i);
	   System.out.println(super.i);
	}
	
	public static void main(String[] args) 
	{
	
		Demo15 d15 = new Demo15();
		d15.m1();
		
	}
	
}
