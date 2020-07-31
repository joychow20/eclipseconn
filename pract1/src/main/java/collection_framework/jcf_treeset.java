package collection_framework;

import java.util.Iterator;
import java.util.TreeSet;

public class jcf_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer>t=new TreeSet<Integer>();
int arr[]= {9,1,3,4,2,3,4,5,6,3,4,5,6,7,8,9,3,2};
for(int s:arr) {
	t.add(s);
}
System.out.println("after inserting elements from array"+t);
Iterator itr=t.descendingIterator();

while(itr.hasNext()) {
	System.out.println(itr.next());
}
System.out.println("highedt value"+t.pollFirst());
System.out.println("lowest value"+t.pollLast());
	}

}
