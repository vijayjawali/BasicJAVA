package programmingclass;
import java.util.Scanner;
public class Q{

	private static Scanner scan;

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 && j<n/2 || j==0&&i<n/2 || i==n/2 &&j<n/2 || j==n/2 && i<n/2 &&i!=0 ||i==j &&i>n/4 &&i<3*(n/4))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
