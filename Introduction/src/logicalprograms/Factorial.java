package logicalprograms;

public class Factorial {

	public static void main(String[] args) {
		
		int num = 4;
		int fact = 1;
		
		for(int i = num; i>=1 ; i--)
		{
			fact = fact*i;     //24
		}
		System.out.println(fact);
		
	}
	
}
