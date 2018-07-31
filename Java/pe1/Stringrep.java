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
	char ch[]=st.toCharArray();
	for(int i=0;i<n;i++)
	{
		for(int j=n;j<ch.length;j++)
		{
			System.out.print(ch[j]);
		}
	}
}
public static void main(String args[])
{
	Stringrep sr=new Stringrep();
	sr.trimStr();
}
}
