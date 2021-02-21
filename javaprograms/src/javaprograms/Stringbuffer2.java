package javaprograms;

public class Stringbuffer2 {

	public static void main(String[] args) {
       StringBuffer s=new StringBuffer();
       System.out.println(s.capacity());
       s.append("SACHIN");
       System.out.println(s.capacity());
       s.append("is a good batsman");
       System.out.println(s.capacity());
	}

}
