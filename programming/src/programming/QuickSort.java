package programming;
import java.util.*;
public class QuickSort {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=scan.nextInt();
		System.out.println("enter the elements of the array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		quicksort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	private static void quicksort(int[] a, int p, int r) {
       
		if(p<r)
		{
			int q=partition(a,p,r);
			quicksort(a,p,q-1);
			quicksort(a,q+1,r);
		}
	}

	private static int partition(int[] a, int p, int r) {
        int x=a[r];
        int i=p-1;
        for(int j=p;j<r;j++)
        {
        	if(a[j]<=x)
        	{
        		i=i+1;
        		int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
        	}
        }
        	int swap = a[r];
            a[r] = a[i+1];
            a[i+1] = swap;

		return i+1;
	}

	

}


