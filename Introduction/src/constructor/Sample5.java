package constructor;

public class Sample5 {

	int i;
	int j;
	
	Sample5(int a , int b)
	{
		i = a;
		j = b;
	}
	
	public void add() {
		System.out.println(i+j);
	}
	
	public void mul() {
		System.out.println(i*j);
	}
	
	public static void main(String[] args) {
		Sample5 s5 = new Sample5(5, 6);
		s5.add();
		s5.mul();
		System.out.println("---------------------");
		Sample5 s6 = new Sample5(4, 3);
		s6.add();
		s6.mul();
	}
	
}
