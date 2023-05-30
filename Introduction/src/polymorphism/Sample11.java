package polymorphism;

public class Sample11 
{

	public static void main(String[] args) 
	{
	   
		//binding of declaration and definition during compile time is called complie time polymorphism
		Sample10 s10 = new Sample10();
		s10.mul(10, 20);
		s10.mul(1, 5, 6);
		
		
	}
	
}
