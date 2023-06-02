package logicalPrograms1;

public class StarPattern 
{

	public static void main(String[] args) 
	{
	
		//****
		//***
		//**
		//*
		
		int star=4;
		int row=4;
		for(int i=1;i<=4;i++)
		{
			for (int j=2*(row-i); j>=0; j--)         
			{  
			//prints space between two stars      
			System.out.print(" ");   
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
//			star--;
		}
		
		
		
		
	}
	
	
}
