package javaprograms;
class Dog3
{
	private String name;
	private String colour;
	private int cost;
	Dog3(String name,String colour,int cost)
	{
		this();
		this.name=name;
		this.colour=colour;
		this.cost=cost;
	}
	Dog3()
	{
	name="PUPPY";
	colour="RED";
	cost=10000;
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
public class Constructors3 {

	public static void main(String[] args) {
		Dog3 d=new Dog3("TOMMY","BROWN",5000);
		System.out.println(d.getName());
		System.out.println(d.getColour());
		System.out.println(d.getCost());
        Dog3 d1=new Dog3();
        System.out.println(d1.getName());
		System.out.println(d1.getColour());
		System.out.println(d1.getCost());
	}

}
