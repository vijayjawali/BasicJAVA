package javaprogrammingclass;
import java.util.*;
public class TrimString {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string");
	String s=scan.nextLine();
	String temp="";
	int st=0,ed=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			st = i;
			break;
		}
	}
	for(int i = s.length()-1;i>0;i--)
	{
		if(s.charAt(i)!=' ')
		{
			ed = i;
			break;
		}
	}
	for(int i=st;i<=ed;i++)
	{
		temp+=s.charAt(i);
	}
	System.out.println(temp);
	
	}

}
