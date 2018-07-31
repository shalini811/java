package com.stackroute.pe1;
import java.util.Scanner;
class Wordcheck {
	void checkWord(String word)
	{ 
		for(int i=0;i<word.length();i++)
		{ 
			char ch=word.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
			switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + "\tis vowel");
                break;
            default:
                System.out.println(ch + "\tis consonant");
        }	
		}
			else
				System.out.println(ch + "\tis Error!!It is not a letter");
	}
	}
public static void main(String args[])
{
	Scanner sd=new Scanner(System.in);
	System.out.print("Enter the String:");
	String wrd=sd.nextLine();
	Wordcheck wc=new Wordcheck();
	wc.checkWord(wrd);
}
}
