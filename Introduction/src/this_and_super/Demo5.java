package this_and_super;

public class Demo5 extends Demo6
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
	   Demo5 d5 = new Demo5();
	   d5.m1();
	}
	
}
