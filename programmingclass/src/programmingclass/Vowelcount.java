package programmingclass;
import java.util.*;

public class Vowelcount {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scan.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' 
					|| s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
