package constructor;

public class Sample10 {
	
	String i;
	int j;
	
	Sample10(String a , int b)
	{
		i = a;
		j = b;
	}
	
	public void info1() {
		System.out.println("Name is " + i + " Age is " +j);
	}
	
	public static void main(String[] args) {
	
		Sample10 s10 = new Sample10("Sourabh", 30);
		s10.info1();
		Sample10 s11 = new Sample10("Shrikant", 38);
		s11.info1();
	}
	

}
