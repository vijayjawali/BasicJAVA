package javaprogrammingclass;



class Dog1
{
	private String name;
	private String colour;
	private int cost;
	Dog1(String name,String colour,int cost)
	{
		this.name=name;
		this.colour=colour;
		this.cost=cost;
	}
	
	public String getName()
	{
		return name;
	}
	 public String getColour()
	{
		return colour;
	}
     public int getCost()
	{
		return cost;
	}
}
public class C {

	public static void main(String[] args) {
		
           Dog1 d=new Dog1("JIMMY","BLACK",30000);
           System.out.println(d.getName());
           System.out.println(d.getColour());
           System.out.println(d.getCost());
           
	}

}

