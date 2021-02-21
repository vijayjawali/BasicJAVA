
class Demo4 extends Thread
{
	public void run()
	{
		System.out.println("Banking");
	}
}
class Demo5 extends Thread
{
	public void run()
	{
		System.out.println("Printing");
	}
}
class Demo6 extends Thread
{
	public void run()
	{
		System.out.println("Addition");
	}
}
public class Multithreading2 {

	public static void main(String[] args) {

		Demo4 d1=new Demo4();
		Demo5 d2=new Demo5();
		Demo6 d3=new Demo6();
		
		d1.start();
		d2.start();
		d3.start();
	}

}
