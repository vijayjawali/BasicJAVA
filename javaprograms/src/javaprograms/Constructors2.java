package javaprograms;
class Dog2
{
	private String name;
	private String colour;
	private int cost;
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
public class Constructors2 {

	public static void main(String[] args) {
		Dog2 d=new Dog2();
		System.out.println(d.getName());
		System.out.println(d.getColour());
		System.out.println(d.getCost());

	}

}
