package com.stackroute.pe1;
import java.util.Scanner;
class Addvalues{
	void calVal() {
Scanner s = new Scanner(System.in);
System.out.println("Enter the total number of values to be added");
int num = s.nextInt();
int sum=0;
System.out.println("Enter the numbers");
int a[] = new int[num];
for (int i = 0; i < num; i++) 
{
    a[i] = s.nextInt();
    sum+=a[i];
}
System.out.println(sum);
}
	public static void main(String args[])
	{
		Addvalues ad=new Addvalues();
		ad.calVal();
	}
	}
