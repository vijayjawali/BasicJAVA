package programming;

import java.util.Scanner;

public class Shellsort {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=scan.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++)
      {
    	  a[i]=scan.nextInt();      
	  }
	  shellsort(a);
	}

	private static void shellsort(int[] a) {
	 
	        for (int gap = a.length/2; gap > 0; gap /= 2)
	        {
	            for (int i = gap; i < a.length; i++)
	            {
	                int temp = a[i]; 
	                int j;
	                for (j = i; j >= gap && a[j - gap] > temp; j -= gap)
	                {
	                	a[j] = a[j - gap];
	                }
	                a[j] = temp;
	            }
	        }
	        for(int i=0;i<a.length;i++)
	        {
	        	System.out.print(a[i]+" ");
	        }
	      
	    
		
	}
}
