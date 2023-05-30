package this_and_super;

public class Demo11 extends Demo12
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
	
		Demo11 d11 = new Demo11();
		d11.info();		
		
	}
	
}
