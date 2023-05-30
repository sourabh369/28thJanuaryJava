package inheritance;

public class Son extends Father{
	
	public void bike() {
		System.out.println("Apache");
	}
	
	public static void main(String[] args) {
		Son s1 = new Son();
		s1.bike();
		s1.car();
		s1.house();
		s1.money();
	}

}
