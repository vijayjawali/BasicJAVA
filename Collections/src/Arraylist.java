import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Arraylist
{
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		System.out.println(ll);
		ll.addFirst(100);
		ll.addLast(200);
		System.out.println(ll);
		ll.remove(5);
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.clone();
		System.out.println(ll);
		ll.addAll(ll);
		System.out.println(ll);
		ll.add(7, 999);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains(30));
		System.out.println(ll.hashCode());
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		Iterator<Integer> itr=ll.iterator();
		System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
		while(itr.hasNext()==true)
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		for(Object x:ll)
		{
			System.out.print(x+" ");
		}
		
	}
}