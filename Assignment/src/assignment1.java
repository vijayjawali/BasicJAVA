import java.util.*;

public class assignment1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		String[] str=new String[n];
		int x=0;
		for(int i=0;i<n;i++)
		{
			str[i]=scan.nextLine();
			
		}
		for(int i=0;i<n;i++)
		{
			
				if(str[i].length()>10)
				{
					System.out.print(str[i].charAt(0));
					System.out.print(str[i].length()-2);
					System.out.print(str[i].charAt(str[i].length()-1));
					System.out.println();
				}
				else
				{
					System.out.println(str[i]);
				}
			
		}

	}

}
