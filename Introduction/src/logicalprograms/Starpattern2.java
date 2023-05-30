package logicalprograms;

public class Starpattern2 
{

	public static void main(String[] args) 
	{
	
		//*
		//**
		//***
		//****
		
		int star=1;
		
		//			5<=4
		for(int i=1;i<=4;i++)
		{
			//			1<=4
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;     //5
		}
		
		
		//*
		//**
		//***
		//****
		//
		
	}
	
}
