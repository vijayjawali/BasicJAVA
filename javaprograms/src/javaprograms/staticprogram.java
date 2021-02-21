package javaprograms;

class Demo
{
	static int a,b,c;
	int x,y,z;
	static
	{
		a=10;
		b=20;
		c=30;
		
	}
	{
		x=9;
		y=99;
		z=999;
	}
	static void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	void disp1()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class staticprogram {

	public static void main(String[] args) {

		Demo.disp();
		Demo d=new Demo();
		d.disp1();
		
	}

}
