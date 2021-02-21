package programming;
import java.util.*;
public class Insertionsort {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
	    for(int j=1;j<a.length;j++)
	    {
	    	
	    	int key=a[j];
	    	int i=j-1;
	    	while(i>=0 && a[i]>key)
	    	{
	    		a[i+1]=a[i];
	    		i=i-1;	
	    	}
	    	a[i+1]=key;
	    }
	    for(int k=0;k<a.length;k++)
	    {
	    	System.out.print(a[k]+" ");
	    }

  }
}
