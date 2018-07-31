package com.stackroute.pe1;
import java.util.Scanner;
public class Descorder {
	int s,i,temp,j,k,sum=0;
	int a[]=new int[20];
	void arrDesc() {
	Scanner sp=new Scanner(System.in);
	System.out.print("Enter a number:");
	s=sp.nextInt();
	while (s > 0) {
	   a[i]=  s % 10;
	    s = s / 10;
	    i++;
	}
	for( j=0;j<i;j++)
	{
		for ( k = i + 1; k<i; k++) 
        {
            if (a[j] < a[k]) 
            {
                temp = a[j];
                a[j] = a[k];
                a[k] = temp;
            }
        }
	}
	for ( j = 0; j < i-1; j++) 
    {
        System.out.print(a[j]);
    }
	System.out.print(a[i-1]);
        if(a[j]%2==0)
        {
        	sum+=a[j];
        }
         	if(sum>15)
         	{
         		System.out.println("\ttrue");
         	}
         	else
         		System.out.println("\tfalse");
	}
	 
	public static void main(String args[])
	{
		Descorder ds=new Descorder();
		ds.arrDesc();
	}}