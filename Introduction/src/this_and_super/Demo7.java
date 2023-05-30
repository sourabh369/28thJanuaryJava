package this_and_super;

public class Demo7 extends Demo8
{

	int i =10;
	
	public void m1()
	{
	
		int i=20;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
	public static void main(String[] args) 
	{
	
		Demo7 d7 = new Demo7();
		d7.m1();
		
	}
	
}
