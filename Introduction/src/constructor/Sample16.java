package constructor;

public class Sample16 
{

	int num1;
	int num2;
	
	Sample16(int i , int j)
	{
		num1 = i;
		num2 = j;
	}
	
	public void add()
	{
	  System.out.println(num1+num2);	
	}
	
	public static void main(String[] args) 
	{
	
		Sample16 s16 = new Sample16(10, 20);
		s16.add();
		
	}
	
}
