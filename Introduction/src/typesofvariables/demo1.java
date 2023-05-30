package typesofvariables;

public class demo1 {
	
	 int a = 5;
	
	public static void main(String[] args) {
		int c = 10;
		
		demo1 d1 = new demo1();
		System.out.println(d1.a);
		System.out.println(c);
		m1();
		d1.m2();
	}
	
	public static void m1() {
		demo1 d2 = new demo1();
		System.out.println(d2.a);
	}
	
	public void m2() 
	{
		int i = 30;
		System.out.println(i);
	}
	
	

}
