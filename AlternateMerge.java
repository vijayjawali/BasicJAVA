import java.util.Scanner;
class TwoArrays 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array1");
		int n1=scan.nextInt();
		int[] ar1=new int[n1];
		System.out.println("enter the size of array2");
		int n2=scan.nextInt();
		int[] ar2=new int[n2];
		int n3=n1+n2;
		int[] ar=new int[n3];
		System.out.println("enter the elements of array1");
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=scan.nextInt();
		}
        System.out.println("enter the elements of array2");
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i]=scan.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
              if(i<ar1.length)
			{
				  ar[i]=ar1[i];
			}
			else if(i<ar.length)
			{
				  ar[i]=ar2[i-n1];
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;i<ar.length;i++)
			{
				if(ar[i]>ar[j])
					{
					int t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
					}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}


	}
}
