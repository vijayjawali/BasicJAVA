package programming;
import java.util.*;
public class Mergesort {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=scan.nextInt();
		System.out.println("Enter the elements of the array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		mergesort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

	private static void mergesort(int[] a, int p, int r) {

		if(p<r)
		{
			int q=(p+r)/2;
			mergesort(a,p,q);
			mergesort(a,q+1,r);
			merge(a,p,q,r);		
		}
	}

	private static void merge(int[] a, int p, int q, int r) {

		int n1=q-p+1;
		int n2=r-q;
		int l[]=new int[n1+1];
		int R[]=new int[n2+1];
		int i,j;
		for(i=0;i<l.length-1;i++)
		{
			l[i]=a[p+i];
		}
		l[i]= 2147483647;
		for( j=0;j<R.length-1;j++)
		{
			R[j]=a[q+1+j];
		}
		R[j]=2147483647;
		i=0;j=0;
		for(int k=p;k<=r;k++)
		{
			if(l[i]<=R[j])
			{
				a[k]=l[i];
				i++;
			}
			else
			{
				a[k]=R[j];
				j++;
			}
		}
		
		
	}

}
