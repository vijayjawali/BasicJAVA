
class Demo1 implements Runnable
{
	public void run()
	{
		System.out.println("Banking");
	}
}
class Demo2 implements Runnable
{
	public void run()
	{
		System.out.println("Printing");
	}
}
class Demo3 implements Runnable
{
	public void run()
	{
		System.out.println("Addition");
	}
}

public class Multithreading1 {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
           
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
