import java.util.Scanner;
class Exc2
{
	void disp() throws Exception
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
		
}
public class Exceptionhandling3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("connection started");
		try
		{
		Exc2 e1=new Exc2();
		e1.disp();
		}
        catch(Exception e)
        {
        	System.out.println("Exception entered main method");
        	System.out.println("Exception :"+e.getMessage());
       
        }
		System.out.println("connection terminated");
	}

}
