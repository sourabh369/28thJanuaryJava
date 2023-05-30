package methods;

public class Sample1{

    public static void main(String[] args) 
    {
		
    	Sample1 d1 = new Sample1();
    	d1.m1();
    	m2();
    	Sample2.m3();
    	Sample2 s2 = new Sample2();
    	s2.m4();
    	
	}
    
    public void m1() {
		System.out.println("This is a non static method 1");
	}
    
    public static void m2() {
		System.out.println("This is a static method");
	}

}