package constructor;

public class Sample9 {

	int i;
	int j;
	
	Sample9()
	{
		i = 10;
		j = 20;
	}
	
	public void add() {
		System.out.println(i+j);
	}
	
	public void mul() {
		System.out.println(i*j);
	}
	
	public static void main(String[] args) {
		Sample9 s9 = new Sample9();
		s9.add();
		s9.mul();
	}
	
	
	
}
