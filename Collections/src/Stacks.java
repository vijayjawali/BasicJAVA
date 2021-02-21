import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack();
		s.push(10);
		s.push(20);
		System.out.println(s);
		s.pop();
	     for(Object x:s)
	     {
	    	 System.out.println(x);
	     }
	     ArrayDeque aq=new ArrayDeque();
	     aq.push(10);
	     aq.push(20);
	     aq.addFirst(100);
	     aq.addLast(200);
	     System.out.println(aq);
	     aq.pop();
	     System.out.println(aq);
	     PriorityQueue pq=new PriorityQueue();
	     pq.add(100);
	     pq.addAll(aq);
	     pq.addAll(s);
	     System.out.println("??????????????????????");
	     System.out.println(pq);
	     while (!pq.isEmpty()) {
	            System.out.println(pq.remove());
	        }
	}

}
