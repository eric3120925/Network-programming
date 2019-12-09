import java.util.*;
public class Eric {
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("first");
		q.offer("second");
		q.offer("third");
		System.out.printf("%s",q);
		System.out.println();
		
		//show the highest priority argument
		System.out.printf("%s",q.peek());
		System.out.println();
		//remove the highest priority argument, push the second one to first priority
		q.poll();
		System.out.printf("%s",q);
	}
}
