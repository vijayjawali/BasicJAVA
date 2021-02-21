package programmingclass;
import java.util.*;
public class Encryption {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scan.nextLine();
		System.out.println("enter the encryption key");
		int k=scan.nextInt();
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				if(s.charAt(i)>=65 && s.charAt(i)<=(90-k))
				{
					temp+=(char)(s.charAt(i)+k);
				}
			
			else
			{
				temp+=(char)(65+k-(90-s.charAt(i)));
			}
			}
		}
		System.out.println("encrypted key is :");
		System.out.println(temp);
	}

}
