
class Demo7 extends Thread
{
	public void run()
	{
		System.out.println("Banking");
	}
}
class Demo8 extends Thread
{
	public void run()
	{
		System.out.println("Printing");
	}
}
class Demo9 extends Thread
{
	public void run()
	{
		System.out.println("Addition");
	}
}
public class Multithreading3 {

	public static void main(String[] args) {

		Demo7 d1=new Demo7();
		Demo8 d2=new Demo8();
		Demo9 d3=new Demo9();
		
		System.out.println(d1.isAlive());
		System.out.println(d2.isAlive());
		System.out.println(d3.isAlive());
		
		d1.start();
		d2.start();
		d3.start();
		
		System.out.println(d1.isAlive());
		System.out.println(d2.isAlive());
		System.out.println(d3.isAlive());
		
	}

}
