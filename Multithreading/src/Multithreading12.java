class Warrior1 extends Thread
{
	String obj1="Brahmastra";
	String obj2="Sarpastra";
	String obj3="Pashupastra";
    public void run()
    {
    	try
    	{
    	if(getName().equals("RAMA"))
    	{
    		synchronized(obj1)
    		{
    			System.out.println("Rama has acquires "+obj1);
    			Thread.sleep(5000);
    			synchronized(obj2)
        		{
        			System.out.println("Rama has acquires "+obj2);
        			Thread.sleep(5000);
        			synchronized(obj3)
            		{
            			System.out.println("Rama has acquires "+obj3);
            			Thread.sleep(5000);
            			
            		}
        		}
    		}
    		
    	}
    	if(getName().equals("RAVANA"))
    	{
    		synchronized(obj3)
    		{
    			System.out.println("Ravana has acquires "+obj3);
    			Thread.sleep(5000);
    			synchronized(obj2)
        		{
        			System.out.println("Ravana has acquires "+obj2);
        			Thread.sleep(5000);
        			synchronized(obj1)
            		{
            			System.out.println("Ravana has acquires "+obj1);
            			Thread.sleep(5000);
            			
            		}
        		}
    		}
    		
    	}
    	}
    	catch(Exception e)
    	{
    		System.out.println("War interrupted");
    	}
    }
}
public class Multithreading12 {

	public static void main(String[] args) {

		Warrior1 w1=new Warrior1();
		Warrior1 w2=new Warrior1();
		
		w1.setName("RAMA");
		w2.setName("RAVANA");
		
		w1.start();
		w2.start();
		
	}

}