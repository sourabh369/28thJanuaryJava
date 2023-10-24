package this_and_super;

public class Demo20 extends Demo16
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
		Demo20 d20 = new Demo20();
		d20.m1();
	}
	
}
