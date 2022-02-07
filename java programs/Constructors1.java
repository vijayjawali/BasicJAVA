package javaprograms;

class Dog
{
	private String name;
	private String colour;
	private int cost;
	Dog(String name,String colour,int cost)
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
class Constructors1 {

	public static void main(String[] args) {
		
           Dog d=new Dog("JIMMY","BLACK",30000);
           System.out.println(d.getName());
           System.out.println(d.getColour());
           System.out.println(d.getCost());
           
	}

}
