// multithreading using single run method
class Demo implements Runnable
{
	public void run()
	{
		if( Thread.currentThread().getName().equals("Banking"))
		{
			banking();
		}
		else if(Thread.currentThread().getName().equals("Printing"))
		{
			printing();
		}
		else
		{
			addition();
		}
		
	}
	
	void banking()
	{
		System.out.println("Banking");
	}
	void printing()
	{
		System.out.println("Printing");
	}
	void addition()
	{
		System.out.println("addition");
	}
}
public class Multithreading5 {

	public static void main(String[] args) {

		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		
		t1.setName("Banking");
		t2.setName("Printing");
		t3.setName("Addition");
		
		t1.start();
		t2.start();
		t3.start();
	
	}

}
