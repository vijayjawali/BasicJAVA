import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class strings1 {


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args)  {
    	int n=scan.nextInt();
    	String s[]=new String[n+1];
       for(int i=0;i<s.length;i++)
    	{
        s[i]=scan.nextLine();
        }
        for(int z=0;z<n;z++)
        {
        int a[]=new int[s[z].length()];
        int c[]=new int[s[z].length()];
        int b[]=new int[s[z].length()];
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=(int)(s[z].charAt(i));
        }
        int j=0;
        for(int i=b.length-1;i>=0;i--)
        {
            b[j]=a[i];
            j++;
        }
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
        for(int i=0;i<b.length;i++)
        {
        	System.out.print(b[i]+" ");
        }
        for(int i=0;i<c.length;i++)
        {
            c[i]=Math.abs(a[i]-b[i]);
        }
        for(int i=0;i<c.length;i++)
        {
        	System.out.print(c[i]+" ");
        }
            
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==1)
            {
               count++;
            }
        }
        if(count==s[z].length())
        {
            System.out.println("Funny");
        }
        else
        {
            System.out.println("Not Funny");
        }
        }  
        
    }
}
