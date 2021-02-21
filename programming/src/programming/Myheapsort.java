package programming;
import java.util.*;
public class Myheapsort {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		heapsort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	private static void heapsort(int[] a) {    
	           for(int i=((a.length)/2)-1;i>=0;i--)
	           {
	        	   heapify(a,a.length,i);
	           }
	           for (int i=(a.length-1); i>=0; i--)
	           {
	               // Move current root to end
	               int temp = a[0];
	               a[0] = a[i];
	               a[i] = temp;
	    
	               // call max heapify on the reduced heap
	               heapify(a, i, 0);
	           }
	}

	private static void heapify(int[] a,int n, int i) {
           int l=(2*i)+1;
           int r=(2*i)+2;
           int largest=i;
           if(l<n && a[l]>a[largest])
           {
        	   largest=l;
           }
           
           if(r<n && a[r]>a[largest])
           {
        	   largest=r;
           }
           if(largest != i)
           {
        	   int swap = a[i];
               a[i] = a[largest];
               a[largest] = swap;
               heapify(a,n,largest);
           }      
	}
}
