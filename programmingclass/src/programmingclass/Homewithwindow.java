package programmingclass;

import java.util.Scanner;

public class Homewithwindow {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("enter the size");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<i+1;k++)
			{
				System.out.print("*");
			}
			for(int l=0;l<5*n;l++)
			{
				System.out.print("*");	
			}
			for(int m=0;m<i;m++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		for(int i=0;i<2*n;i++)
		{
			for(int j=0;j<8*n;j++)
			{
				if(j==0 ||j==(2*n) ||j==3*n &&( i>1 && i< n-3)||( j==6*n ||j==4*n ||j==5*n) &&( i>1 && i< n-3) || (i==1||i==(n/2)-1) && j>3*n && j<6*n|| i==n-3 && j>3*n && j<6*n || j==(7*n)-2 ||i==n-1&&j<(7*n)-2 ||i==((2*n)-1)&&j<(7*n)-2 || j==(n/2) && i>n+1|| j==6*(n/4) && i>n+1 || i==n+1 && j>=(n/2) && j<=6*(n/4))
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

