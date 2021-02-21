import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Searches {

    public static void main(String[] args) throws IOException {
     Scanner scan=new Scanner(System.in);
        int yes=0;
        int num=scan.nextInt();
        for(int v=0;v<num;v++)
        {
        int lsum=0,rsum=0;
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(i==0)
            {
                lsum=0;
                rsum=0;
                for(int k=1;k<a.length;k++)
                {
                    rsum+=a[k];
                }
                if(lsum==rsum)
                {
                    yes++;
                }
            }
            else if(i==(a.length-1))
            {
                rsum=0;
                lsum=0;
                for(int k=0;k<a.length-1;k++)
                {
                    lsum+=a[k];
                }
                if(lsum==rsum)
                {
                    yes++;
                }
            }
            else
            {
                rsum=0;
                lsum=0;
                for(int k=1;k<a.length;k++)
                {
                    for(int j=0;j<k;j++)
                    {
                        lsum+=a[j];
                    }
                    for(int j=k+1;j<a.length;j++)
                    {
                        rsum+=a[j];
                    }
                    if(lsum==rsum)
                    {
                       yes++;
                    }
                }
            }
         
            
        }
             
            if(yes==0)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }  
        }
    }
}