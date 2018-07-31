package com.stackroute.pe1;

import java.util.Scanner;

public class Stringrev {
void revStr(String wrd)
{
	String rev="";
	for(int i=wrd.length()-1;i>=0;i--)
	{
		rev+=wrd.charAt(i);
		}
	System.out.println("The reverse string is:"+rev);
	
}

public static void main(String args[])
{
	Scanner sed=new Scanner(System.in);
	System.out.print("Enter the String:");
	String wd=sed.nextLine();
	Stringrev sv=new Stringrev();
	sv.revStr(wd);
}
}
