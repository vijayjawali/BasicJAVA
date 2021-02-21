
import java.util.*;

public class Solution {


    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        int num=0,small=0,cap=0,sp=0,ou=0,smalls=0,caps=0,nums=0,sps=0;
        int n=scan.nextInt();
        String s=scan.nextLine();
        for(int i=0;i<s.length()-1;i++)
        {
           if(s.charAt(i)>=48 && s.charAt(i)<=57)
            {
                num++;
            }
            else if(s.charAt(i)>=97 && s.charAt(i)<=122)
            {
                small++;
            }
             else if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                cap++;
            }
            else
            {
                sp++;
            }
            
        }
        System.out.print(num);
        System.out.print(small);
        System.out.print(cap);
        System.out.print(sp);
            if(num==0)
            {
               nums=1;
            }
            if(small==0)
            {
               smalls=1;
            }
            if(cap==0)
            {
               caps=1;
            }
            if(sp==0)
            {
               sps=1;
            }
            if(n<6)
            {
                if(6-n>ou)
                {
                System.out.print(6-n);
                }                
            }
            else
            {
                 System.out.print(nums+smalls+caps+sps);
            }
            
        
        
    }
}
