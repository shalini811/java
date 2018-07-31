package com.stackroute.pe1;
import java.util.Scanner;
class Oddeven {
void checkNum(int num)
{
	if(num%2==0)
	{
		if(num>20 && num<30)
		{
				System.out.println("Jerry");
		}
			else
			{
			System.out.println("Even and Out of Range");
		}
	}
	else
	{ 
		if(num>=20 && num<=30)
	{
		System.out.println("Tom");
	}
		else
		{	
	System.out.println("Odd and Out of Range");
	}

}
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n=sc.nextInt();
	Oddeven oe=new Oddeven();
	oe.checkNum(n);
}
}

