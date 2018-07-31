package com.stackroute.pe1;
import java.util.Scanner;
public class Charcheck {
void chkChar()
{   char i,j,k;
	Scanner sw=new Scanner(System.in);
	System.out.print("Enter a character:");
	char s=sw.next().charAt(0);
	if(s>='a' && s<='z' || s>='A' && s<='Z'|| s>='0' && s<='9')
	{
	for(i='a';i<='z';i++)
	{
		if(i==s)
			System.out.println(s + "\tis a small case letter");
	}
	
	for(j='A';j<='Z';j++)	
	{
		if(j==s)
		System.out.println(s + " \tis a Capital letter");
	}
	for(k='0';k<='9';k++)
		{
		if(k==s)
		System.out.println(s + " \tis a digit");
	}
	}
	else
		System.out.println(s + "\t is a special symbol");
		
	}

public static void main(String args[])
{
	Charcheck cc=new Charcheck();
	cc.chkChar();
}}