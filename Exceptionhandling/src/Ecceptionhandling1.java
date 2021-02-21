import java.util.*;
public class Ecceptionhandling1 {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("tru block starting");
			System.out.println("enter the first number");
			int a=scan.nextInt();
			System.out.println("enter the second number");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
			System.out.println("try block ending");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception :"+e.getMessage());
		}
		finally
		{
			System.out.println("finally block ending ");
		}
		
	}

}
