package inheritance;

public class Grandson1 extends Son1 {
	
	public void mobile() {
		System.out.println("OPPO");
	}
	
	public static void main(String[] args) {
		Grandson1 g1 = new Grandson1();
		g1.mobile();
		g1.bike();
		g1.car();
		g1.house();
	}

}
