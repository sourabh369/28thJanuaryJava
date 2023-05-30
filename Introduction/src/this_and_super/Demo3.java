package this_and_super;

public class Demo3 extends Demo4 
{

	int i = 10;
	
	public void m1() 
	{
	  int i = 20;
	  System.out.println(i);
	  System.out.println(this.i);
	  System.out.println(super.i);
	}
	
	public static void main(String[] args) 
	{
	
		Demo3 d3 = new Demo3();
		d3.m1();
		
	}
	
}
