package mock;

public class Sample1 
{
	
	  public static void main(String[] args) {
		  int num1 = 0;
		  int num2 = 1;
		  int sum = 0;
		  
//		                0
		  for(int i=0 ; i<9 ; i++)
		  {
			sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
		  }
		  
		  
	}
	
//    0 1 1 2 3 5 8
}
