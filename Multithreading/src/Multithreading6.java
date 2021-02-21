class Msword extends Thread
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
			for(int i=0;i<5;i++)
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
			for(int i=0;i<5;i++)
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

public class Multithreading6 {

	public static void main(String[] args) {
		Msword ms1=new Msword();
		Msword ms2=new Msword();
		Msword ms3=new Msword();
		
		ms1.setName("typing");
		ms2.setName("autosave");
		ms3.setName("spellcheck");
		
		ms1.start();
		ms2.start();
		ms3.start();
	}

}
