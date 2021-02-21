
package javaprogrammingclass;
import java.util.Scanner;
public class StringToArrayAlternateReverse {

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
		temp="";
		for(int i=0; i<ar.length/2;i++)
		{
			temp=ar[i];
			ar[i]=ar[ar.length-i-1];
			ar[ar.length-i-1]=temp;
			i++;
		}
		
		
		for(int i=0; i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}



}
