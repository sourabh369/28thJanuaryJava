package loops;

public class Reversepyramid {

	public static void main(String[] args) {
		int k = 1;

		for(int i=4;i>0;i--)
		{
			for(int j=5-i;j>0;j--)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	}
	
}
