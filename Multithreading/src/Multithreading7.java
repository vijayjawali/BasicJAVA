class Msword1 extends Thread
{
	public void run()
	{
		if(getName().equals("typing"))
		{
			typing();
		}
		else if(getName().equals("autosave"))
		{
			autosave();
		}
		else
		{
			spellcheck();
		}
		
	}
	void typing()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
		       System.out.println("typing");
		       Thread.sleep(5000);
			}
		}
		catch(Exception e)
		{
			System.out.println("typing interrupted");
		}
	}
	void autosave()
	{
		try
		{
			for(;;)
			{
		       System.out.println("autosave");
		       Thread.sleep(5000);
			}
		}
		catch(Exception e)
		{
			System.out.println("autosave interrupted");
		}
	}
	void spellcheck()
	{
		try
		{
			for(;;)
			{
		       System.out.println("spellcheck");
		       Thread.sleep(5000);
			}
		}
		catch(Exception e)
		{
			System.out.println("spellcheck interrupted");
		}
	}
}

public class Multithreading7 {

	public static void main(String[] args) {
		Msword1 ms1=new Msword1();
		Msword1 ms2=new Msword1();
		Msword1 ms3=new Msword1();
		
		ms1.setName("typing");
		ms2.setName("autosave"); 
		ms3.setName("spellcheck");
		
		ms2.setPriority(5);
		ms3.setPriority(9);
		
		ms2.setDaemon(true);
		ms3.setDaemon(true);
		
		ms1.start();
		ms2.start();
		ms3.start();
	}

}
