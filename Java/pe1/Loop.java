package com.stackroute.pe1;
import java.util.Scanner;
public class Loop {
void dispLoop(int num)
{
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("\t" + i);
		}
	}
}
public static void main(String args[])
{
	Scanner sd=new Scanner(System.in);
	System.out.print("Enter the Value:");
	int n=sd.nextInt();
	Loop lp=new Loop();
	lp.dispLoop(n);
}
}

