package logicalPrograms4;

public class Star 
{

	public static void main(String[] args) 
	{
	
		//*
		//**
		//***
		//****
		//*****
		
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		
		//*****
		//****
		//***
		//**
		//*
		
		int star1=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star1--;
		}
		
	}
	
}
