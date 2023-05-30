package methods;

public class Sample3 {
	
	public static void main(String[] args) {
		m1();
		m1();
		m2();
		Sample3 s3 = new Sample3();
		s3.m3();
		s3.m4();
		Sample4.m6();
		Sample4 s4 = new Sample4();
		s4.m5();
		s4.m7("Sourabh", 30);
		s4.m8();
	}
	
	public static void m1() {
		System.out.println("Running method m1");
	}
	
	public static void m2() {
		System.out.println("Running method m2");
	}
	
	public void m3() {
		System.out.println("Running method m3");
	}
	
	public void m4()
	{
		System.out.println("Running method m4");
	}

}
