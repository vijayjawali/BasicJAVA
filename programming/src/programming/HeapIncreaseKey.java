package programming;

import java.util.Scanner;

public class HeapIncreaseKey {

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
		buildheap(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("enter the key ");
		int key=scan.nextInt();
		System.out.println("enter the position of the element");
		int k=scan.nextInt();
		heapincreasekeyfn(a,k,key);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

	 static void heapincreasekeyfn(int[] a, int i, int key) {
		
		 if(key<a[i])
		 {
			 System.out.println("Error");
		 }
		 a[i]=key;
		 while(i>0 && a[i/2]<a[i])
		 {
			 int temp=a[i];
			 a[i]=a[i/2];
			 a[i/2]=temp;
			 i=i/2;
		 }
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
