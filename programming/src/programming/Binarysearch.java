package programming;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=scan.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
	    }
        System.out.println("enter the element to find");
        int val=scan.nextInt();
        bubblesort(a);
	    binarysearch(a,val);

}

	private static int[] bubblesort(int[] a) {
               for(int i=0;i<a.length-1;i++)
               {
            	   for(int j=i+1;j<a.length;j++)
            	   {
            		   if(a[i]>a[j])
            		   {
            			   int temp=a[i];
            			   a[i]=a[j];
            			   a[j]=temp;
            		   }
            	   }
               }
               System.out.println("the sorted array is");
               for(Object x:a)
               {
               System.out.print(x+" ");
               }
               System.out.println();
               return a;
	}

	private static void binarysearch(int[] a, int val) {
		int highindex=a.length-1;
		int lowindex=0;
		while(lowindex <=highindex)
		{
			int middleindex=(lowindex+highindex)/2;
			if(a[middleindex]>val)
			{
				highindex=middleindex-1;
			}
			else if(a[middleindex]<val)
			{
				lowindex=middleindex+1;
			}
			else if(a[middleindex]==val)
			{
				System.out.println("the value "+val+" is found at index "+middleindex);
				return;
			}
		}
		System.out.println("element not found");
	}
		
	}
