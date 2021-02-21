package programmingclass;
import java.util.Scanner;
public class NumberPattern {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			int sum=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(sum+"* *");
				sum=sum+n-j;
			}
			System.out.println();
		}
	}

}
