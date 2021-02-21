import java.util.Scanner;
class Exc1
{
	void disp() throws Exception
	{
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("try block starting");
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
			throw e;
		}
		finally
		{
			System.out.println("finally block ending ");
		}
	}	
		
}
public class Exceptionhandling2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("connection started");
		try
		{
		Exc1 e1=new Exc1();
		e1.disp();
		}
        catch(Exception e)
        {
        	System.out.println("Exception entered main method");
       
        }
		System.out.println("connection terminated");
	}

}
