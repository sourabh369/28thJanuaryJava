package methods;

public class Sample5 
{

	public void m1() {
		System.out.println("Running non static method");
	}
	
	public static void m2() {
		System.out.println("Running static method");
	}
	
	public static void main(String[] args) {
		m2();
		Sample5 s5 = new Sample5();
		s5.m1();
		Sample6.m3();
		Sample6 s6 = new Sample6();
		s6.m4();
	}
	
	
}
