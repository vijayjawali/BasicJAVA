import java.util.Scanner;
class  Asterisk
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A' || s.charAt(i)=='a')
			{
                temp+="*"+s.charAt(i);
			}
			else
			{
				temp+=s.charAt(i);
			}
		}
		System.out.println(temp);
	}
}
