package polymorphism;

public class Sample14 
{

	public static void main(String[] args) 
	{
	
//		Sample13 s13 = new Sample13();
//		s13.bike();
//		s13.flat();
//		s13.car();
		
		//run time polymorphism where method declaration and definition is binded during run time
		Sample12 s12 = new Sample12();
		s12.car();
		s12.flat();
		
		
	}
	
}
