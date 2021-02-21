class Bathroom implements Runnable
{
	public void run()
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

public class Multithreading8 {

	public static void main(String[] args) {
		Bathroom b=new Bathroom();
		
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		Thread t3=new Thread(b);
		
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Others");
		
		t1.start();
		t2.start();
		t3.start();
           
	}

}
