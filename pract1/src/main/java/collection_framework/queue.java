package collection_framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void add_queue() {
		Queue<String>qu=new LinkedList<String>();
		String arr[]= {"joy","roy","soy"};
		
		for(String st:arr) {
			qu.add(st);
		}
		Iterator itr=qu.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(qu);
		qu.add("kaka");
		System.out.println(qu);
		String k=qu.element();
		System.out.println(k);
		Queue<String>qut=new LinkedList<String>();
		System.out.println(qut.peek());
		
		
			System.out.println(qut.element());
		
			// TODO Auto-generated catch block
			System.out.println("the queue is an empty.Please add elements");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add_queue();
		
	}

}
