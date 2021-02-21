package javaprogrammingclass;
import java.util.*;
public class Anagram {
	
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

	 private static String sort(String s) {
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


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=scan.nextLine();
		System.out.println("enter the second string");
		String s2=scan.nextLine();
		s1=removeSpace(s1);
		s2=removeSpace(s2);
		
		if(s1.length()==s2.length())
		{
			s1=toLoweCase(s1);
			s2=toLoweCase(s2);
			s1=sort(s1);
			s2=sort(s2);
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					System.out.println("Strings are not anagram");
				    return;
				}
					
			}
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("the strings are not anagran");
		}
	}

	


	
}
