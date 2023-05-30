package accessspecifier;

public class Demo1 {
	
	private int i = 10;
	
	private void m1() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.m1();
		System.out.println(d1.i);
	}

}
