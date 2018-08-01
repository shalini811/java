package com.stackroute.pe1;
import java.util.Scanner;
class Stringrep {
void trimStr()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String:");
	String st=s.next();
	System.out.println("Enter the Number:");
	int n=s.nextInt();
	System.out.print(st);
	for(int i=0;i<n;i++)
	{
		for(int j=st.length()-n;j<st.length();j++)
		{
			System.out.print(st.charAt(j));
		}
	}
}
public static void main(String args[])
{
	Stringrep sr=new Stringrep();
	sr.trimStr();
}
}
