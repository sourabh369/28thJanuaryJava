package this_and_super;

public class Demo9 extends Demo10
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
	
		Demo9 d9 = new Demo9();
		d9.m1();
		
	}
	
}
