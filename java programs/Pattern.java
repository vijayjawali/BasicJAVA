import java.util.*;
class Pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the size");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<=i)
				{
		    System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n-i;j++)
			{
		    System.out.print(" ");
			}
			
			for(int j=0;j<(2*i)+1;j++)
			{
		    System.out.print("*");
			}
			for(int j=0;j<n-i;j++)
			{
		    System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++)
			{
		    System.out.print(" ");
			}
			for(int j=0;j<i+1;j++)
			{
		    System.out.print("*");
			}
			
			
			System.out.println();
		}
	}
}
