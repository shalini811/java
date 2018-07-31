package com.stackroute.pe1;
import java.util.Scanner;
public class Guessnum {
void numGuess(int n)
{
	int num=35;
	if(n==num)
	{
		System.out.println("Number guessed matches the original number");
	}
	else if(n>num)
	{
		System.out.println("Number guessed is more than original number");
	}
	else if(n<num)
	{
		System.out.println("Number guessed is less than original number");
	}
	}
public static void main(String args[])
{
	Scanner st=new Scanner(System.in);
	System.out.print("Enter the number[1-50]");
	int di=st.nextInt();
	Guessnum gn=new Guessnum();
	gn.numGuess(di);
	st.close();
}
}
