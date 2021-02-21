package javaprograms;


import java.util.Scanner;
public class Caeser {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		StringBuilder s=new StringBuilder(scan.nextLine());
		int r=scan.nextInt();	
		for(int i=0;i<n;i++)
		{
			if((s.charAt(i)>=65 && s.charAt(i)<=90) || s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				char x=s.charAt(i);
				x+=r;
				s.insert(i, x);
				
			}
		}
		System.out.print(s);
	
	}

}
