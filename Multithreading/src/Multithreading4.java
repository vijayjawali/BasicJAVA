
class Demo10 extends Thread
{
	public void run()
	{
		System.out.println("Banking");
	}
}
class Demo11 extends Thread
{
	public void run()
	{
		System.out.println("Printing");
	}
}
class Demo12 extends Thread
{
	public void run()
	{
		System.out.println("Addition");
	}
}
public class Multithreading4 {

	public static void main(String[] args) throws Exception {
		System.out.println("Multithreading started");

		Demo10 d1=new Demo10();
		Demo11 d2=new Demo11();
		Demo12 d3=new Demo12();
		
		System.out.println(d1.isAlive());
		System.out.println(d2.isAlive()); 
		System.out.println(d3.isAlive());
		
		d1.start();
		d2.start();
		d3.start();
		
		System.out.println(d1.isAlive());
		System.out.println(d2.isAlive());
		System.out.println(d3.isAlive());
		
		d1.join();
		d2.join();
		d3.join();
		
		System.out.println("Multithreading ended");
		
	}

}

