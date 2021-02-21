package javaprograms;

public class strings12 
{

	public static void main(String[] args) 
	{
		String s="RajaRamMohanRoy";
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.codePointCount(2, 10));
		System.out.println(s.substring(2, 12));
		System.out.println(s.charAt(5));
		System.out.println(s.contains("Mohan"));
	}

}
