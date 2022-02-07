import java.util.*;
class Rotate 
{
	public static void main(String[] args) 
	{
    Scanner scan=new Scanner(System.in);
	String temp="";
	String s=scan.nextLine();
	for(int i=s.length()-1;i>=0;i--)
		{
          temp+=s.charAt(i);
		}
		System.out.println(temp);
	}
}
