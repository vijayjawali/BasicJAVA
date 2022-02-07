import java.util.*;
class Demo 
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	String temp="";
	int sum=0;
	String s=scan.nextLine();
	for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
			sum+=(int)(s.charAt(i)-48);
			}
		else
			{
			temp+=s.charAt(i);
			}
		
		}
		System.out.println(temp+sum);
	}
}
