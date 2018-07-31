package com.stackroute.pe1;
import java.util.Scanner;
class Palindrome {
	public int t, tot=0,rem;
 void checkPal(int num)
 {
	t=num;
	 while(num>0)
	 {
		 rem=num%10;
		 tot=(tot*10)+rem;
		 num=num/10;
	 }
	 if(t==tot)
	 {
		 int i,a=0,s;
		 s=t;
		 while(t>0)
		 {
	    i=t%10;
	    if(i%2==0)
	    {
	    	a+=i;
	    }
	    t=t/10;
	 }
	 	 if(a>25)
		 {
			 System.out.println(s + "is  is palindrome and the sum of even numbers is greater than 25");
		 }
		 else
			 System.out.println(s + "is palindrome and sum of even numbers is less than 25");
	 }
	 
 
	 else
		 System.out.println(t+ "is not palindrome");
 }

public static void main(String args[])
{
	Scanner sca=new Scanner(System.in);
	Palindrome pl=new Palindrome();
	System.out.print("Enter the number:");
	int n=sca.nextInt();
	pl.checkPal(n);
 
}
}
