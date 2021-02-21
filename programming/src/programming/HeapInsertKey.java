package programming;

import java.util.Scanner;

public class HeapInsertKey {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		buildheap(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	    a=insert(a);
	    for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	    System.out.println();
		a=delete(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	    System.out.println();
	}
	private static int[] delete(int[] a) {
		int b[]=new int[a.length-1];
		int k=0;
		System.out.println("element deleted is "+a[0]);
		for(int i=1;i<a.length;i++)
		{
			b[k]=a[i];
			k++;
		}
		buildheap(b);
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[j]+" ");
		}
		System.out.println();
		return b;
	}
	private static int[] insert(int[] a) {
		   System.out.println("enter the element to insert");
		    int value=scan.nextInt();
		    int b[]=new int[a.length+1];
		    int i;
		    for( i=0;i<a.length;i++)
		    {
		    	b[i]=a[i];
		    }
			b[i]=value;
			buildheap(b);
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[j]+" ");
			}
		System.out.println();
		return b;
	}
	
	 private static void buildheap(int[] a) {    
         for(int i=((a.length)/2)-1;i>=0;i--)
         {
      	   heapify(a,i);
         }
}

private static void heapify(int[] a, int i) {
     int l=(2*i)+1;
     int r=(2*i)+2;
     int largest=i;
     if(l<a.length && a[l]>a[largest])
     {
  	   largest=l;
     }
     
     if(r<a.length && a[r]>a[largest])
     {
  	   largest=r;
     }
     if(largest != i)
     {
  	   int swap = a[i];
         a[i] = a[largest];
         a[largest] = swap;
         heapify(a,largest);
     }  
     
}

}
