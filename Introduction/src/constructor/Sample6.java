package constructor;

public class Sample6 {

	String i;
	int j;

	Sample6(String a , int b)
	{
		i = a;
		j = b;
	}
	
	public void details() 
	{
		System.out.println("Name of the employee is " + i + " age of the employee is " + j);
	}
	
	public static void main(String[] args) {
		Sample6 s6 = new Sample6("Sourabh", 30);
		s6.details();
		
		Sample6 s7 = new Sample6("Tanay", 15);
		s7.details();
	}
	
}
