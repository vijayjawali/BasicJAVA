package javaprogrammingclass;

import java.util.Scanner;

public class Anagrampairs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		String[] ar=new String[n];
		System.out.println("enter the strings");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextLine();
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length-1;j++)
			{
				boolean b=mycompare(ar[i],ar[j]);
				if(b)
				{
					System.out.println(ar[i]+"  "+ar[j]);
					
				}
			}
		}

	}

    static boolean mycompare(String s1, String s2) {
		s1=removeSpace(s1);
		s2=removeSpace(s2);
		if(s1.length()==s2.length())
		{
			s1=toLoweCase(s1);
			s2=toLoweCase(s2);
			s1=sort(s1);
			s1=sort(s1);
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					return false;
				}
			}
			return true;
			
		}
		else
		{
			return false;
		}
		
	}

	static String removeSpace(String s) {
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp+=s.charAt(i);
			}
		}
		
		return temp;
	}
	 static String toLoweCase(String s) {
		 String temp="";
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)>=65 && s.charAt(i)<=90)
			 {
				 temp+=(char)(s.charAt(i)+32);
			 }
			 else
			 {
				 temp+=s.charAt(i);
			 }
		 }
			return temp;
		}
	 
	 static String sort(String s) {
		 String temp="";
		 char[] a=s.toCharArray();
		 for(int i=0;i<s.length()-1;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					char t=a[i];
					a[i]=a[j];
					a[j]=t;				
				 }
			 }
		 }
		 
		 for(int i=0;i<s.length();i++)
		 {
			 temp+=a[i];
		 }
			return temp;
		}
}
