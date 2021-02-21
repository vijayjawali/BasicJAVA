class Bathroom2 implements Runnable
{
	synchronized public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+" is entering the bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+" is using the bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+" is exting the bathroom");
			Thread.sleep(5000);		
		}
		catch(Exception e)
		{
			System.out.println("usage interrupted");
		}
	}
}

public class Multithreading10 {

	public static void main(String[] args) throws Exception {
		Bathroom2 b=new Bathroom2();
		
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		Thread t3=new Thread(b);
		
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Others");
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
           
	}

}
