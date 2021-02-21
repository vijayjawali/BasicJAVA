package javaprogrammingclass;
import java.util.Scanner;
public class Panagram {
	 static String removeExtras(String s) {
		 String temp="";
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122)
			 {
				 temp+=s.charAt(i);
			 }
		 }
		return temp;
	}

		private static String sort(String s) {
			String temp="";
			char[] a=s.toCharArray();
			for(int i=0;i<a.length-1;i++)
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
				for(int i=0;i<a.length;i++)
				{
					temp+=a[i];
				}
			
			
			return temp;
		}


		private static String removeDuplicate(String s) {
			String temp="";
			for(int i=0;i<s.length()-1;i++)
			{
				if(s.charAt(i)!=s.charAt(i+1))
				{
					temp+=s.charAt(i);
				}
			}
			temp+=s.charAt(s.length()-1);
			return temp;
		}


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scan.nextLine();
		scan.close();
        s=removeExtras(s);
        s=sort(s);
        s=removeDuplicate(s);
        if(s.length()==26)
        {
        	 System.out.println("PANAGRAM");
        }
        else
        {
        	System.out.println("NOT PANAGRAM");
        }
	}

	

}
