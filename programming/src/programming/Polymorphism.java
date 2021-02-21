package programming;
class Plane
{
	void takeoff()
	{
		System.out.println("Plane is taking off");
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land()
	{
		System.out.println("Plane is landing");
	}
}
class CargoPlane extends Plane
{
	void takeoff()
	{
		System.out.println("Cargo Plane is taking off");
	}
	void fly()
	{
		System.out.println("Cargo Plane is flying");
	}
	void land()
	{
		System.out.println("Cargo Plane is landing");
	}
}
class PassengerPlane extends Plane
{
	void takeoff()
	{
		System.out.println("Passenger  Plane is taking off");
	}
	void fly()
	{
		System.out.println("Passenger  Plane is flying");
	}
	void land()
	{
		System.out.println("Passenger Plane is landing");
	}
}
class FighterPlane extends Plane
{
	void takeoff()
	{
	System.out.println("Fighter Plane is taking off");
}
void fly()
{
	System.out.println("Fighter Plane is flying");
}
void land()
{
	System.out.println("Fighter Plane is landing");
}
}
class Airport
{
	void permission(Plane ref)
	{
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		Airport a=new Airport();
		a.permission(cp);
		a.permission(pp);
		a.permission(fp);

	}

}
