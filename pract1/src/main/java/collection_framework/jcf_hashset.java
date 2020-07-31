package collection_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class jcf_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Linked hashset is same as hash set
		 * only difference is it maintains the insertion order
		 * all other functionality is same as hash set
		 * it extends hash set class and implements set interface
		 */
HashSet<Integer>h=new HashSet<Integer>();
h.add(7);
h.add(72);
h.add(73);
h.add(7);
h.add(71);
System.out.println("The hash set after adding elements"+h);
int arr[]= {7,9,3,4,5,6,7,8,5,3,4,5};
for(int s:arr) {
	h.add(s);
	}
System.out.println("after adding elements in hashset from an array"+h);
List<Integer>al=new ArrayList<Integer>();
for(int k:arr) {
	al.add(k);
}
System.out.println("after adding elements in arrayist from array"+al);
HashSet<Integer>nh=new HashSet<Integer>(al);
System.out.println("after adding elemets from arraylist to hashset"+nh);
Iterator itr=nh.iterator();
while(itr.hasNext()) {
	System.out.println("iterating elements from hashset using iterator"+itr.next());
}
}

}
