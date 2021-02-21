package programmingclass;
import java.util.*;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scan.nextLine();
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			t+=s.charAt(i);
		}
		System.out.println(t);

	}

}
