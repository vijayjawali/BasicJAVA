package programming;

import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();			
		}
		selectonsort(a);
	}

	private static void selectonsort(int[] a) {
		      int min;
              for(int i=0;i<a.length-1;i++)
              {
            	  min=a[i];
            	  for(int j=i;j<a.length;j++)
            	  {
            		  min=a[j];
            		  if(a[j]<a[i])
            		  {
            			 int temp=a[j];
            			 a[j]=a[i];
            			 a[i]=temp;
            		  }
            		  for(int k=0;k<a.length;k++)
                      {
                    	  System.out.print(a[k]+" ");
                      }
            		  System.out.println();
            	  }
              }
              for(int i=0;i<a.length;i++)
              {
            	  System.out.print(a[i]+" ");
              }
              
	}

}
