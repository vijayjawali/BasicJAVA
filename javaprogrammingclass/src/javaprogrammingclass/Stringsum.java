package javaprogrammingclass;
import java.util.Scanner;
public class Stringsum {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      String s=scan.nextLine();
      int sum=0;
      String temp="";
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
