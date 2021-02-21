package programmingclass;

import java.util.Scanner;

public class Stringvcnsp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scan.nextLine();
		int v=0,c=0,n=0,sp=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>=65 && s.charAt(i)<=90) || s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' 
						|| s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
				{
					v++;
				}
				else
				{
					c++;
				}
			}
			else if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				n++;
			}
			else
			{
				sp++;
			}
		}
		System.out.println("vowels :"+v);
		System.out.println("consonants :"+c);
		System.out.println("numbers :"+n);
		System.out.println("special characters :"+sp);

	}

}
