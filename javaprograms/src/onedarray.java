
import java.util.*;
public class onedarray {

	public static void main(String[] args) 
	{
		int i;
		int a[]=new int[5];
		Scanner scan=new Scanner(System.in);
		for(i=0;i<=a.length-1;i++)
		{
			System.out.println("enter the maks of student "+i);
			a[i]=scan.nextInt();
		}
		for(i=0;i<=a.length-1;i++)
		{
			System.out.println("the marks of student "+i+" is");
			System.out.println(a[i]);
		}
		

	}

}
