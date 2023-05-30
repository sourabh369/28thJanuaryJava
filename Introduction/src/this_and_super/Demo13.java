package this_and_super;

public class Demo13 extends Demo14
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
	
		Demo13 d13 = new Demo13();
		d13.m1();
		
		
	}
	
}
