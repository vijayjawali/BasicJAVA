package javaprogrammingclass;
import java.util.Scanner;
public class StringToArrayReverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String temp="";
		int count=1;
		temp=s+" ";
		for(int i=0;i<temp.length()-1;i++)
		{
			if(temp.charAt(i)==' ')
			{
				count++;
			}
		}
		String[] ar=new String[count];
		String samp="";
		int j=0;
		for(int i=0;i<temp.length();i++)
		{
			if(temp.charAt(i)!=' ')
			{
				samp+=temp.charAt(i);
			}
			else
			{
				ar[j]=samp;
				j++;
				samp="";
			}
		}
		for(int i=0;i<ar.length;i++ )
		{
			ar[i]=reverse(ar[i]);
			System.out.print(ar[i]+" ");
		}

	}

	 static String reverse(String s) {
		 String temp="";
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 
				 temp+=s.charAt(i);
			 
		 }
		return temp;
	}

}
