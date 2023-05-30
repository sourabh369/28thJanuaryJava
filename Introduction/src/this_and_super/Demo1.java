package this_and_super;

public class Demo1 extends Demo2 {
	
	int a = 20;
	
	public void m1() {
		int a = 10;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.m1();
	}

}
