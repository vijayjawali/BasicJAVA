
public class pattern2
{

	public static void main(String[] args) 
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
			System.out.print(" ");	
			}
			for(k=1;k<=(2*i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=5;i++)
		{
			System.out.print(" ");
			for(j=1;j<=9;j++)
			{
				if(j==1||j==2||j==3||j==7||j==8||j==9)
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



