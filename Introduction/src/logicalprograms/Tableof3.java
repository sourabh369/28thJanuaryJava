package logicalprograms;

public class Tableof3 
{

	public static void main(String[] args) 
	{
	
		int num=3;
		int i=3;
		int j=1;
		
//		for(int i=num;i<=30;i=i+3)
//		{
//			System.out.println(num + "*" + j + "=" + i);
//			j++;
//		}
		
		System.out.println("---Print table using while loop--");
		while(i<=30)
		{
			System.out.println(num + "*" + j + "=" +i);
			i=i+3;
			j++;
		}
	}
	
}
 