package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class jcf_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Array list and Linked list is almost similar in working with a few theoretical changes
		 * changes which has been discussed in copy.Rest similar.
		 * AL implements only list LL implements both List and Queue
		 * LL can also be used as a stack queue and list
		 * LL maintains insertion order
		 */
		int arr[]= {9,7,81,5,6,7,3,4,6,8,2,3,5,7};
ArrayList<Integer>al=new ArrayList<Integer>();//convert array to list
for(int a:arr) {
	al.add(a);
}
LinkedList<Object>ll=new LinkedList<Object>();
for(Object e:arr) {
	ll.add(e);
}
System.out.print(ll);
ArrayList<Integer>al2=new ArrayList<Integer>();
ArrayList<String>al3=new ArrayList<String>();
ArrayList<Object>al4=new ArrayList<Object>();
List<String>mylist=new ArrayList<String>();
mylist.add("joy");

mylist.add("raya");
System.out.print("after adding of elements in array list "+ mylist);
String oarr[]=mylist.toArray(new String[mylist.size()]);//converting list to array




System.out.print("Printing array"+Arrays.toString(oarr));
al3.add("joydeep");
al2.add(35);
al.addAll(al2);
al4.addAll(al3);
al4.addAll(al);
Collections.sort(al);
//Collections.sort(al4);
Iterator itr=al4.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

List<String> fruitList = new ArrayList<String>();    
fruitList.add("Mango");    
fruitList.add("Banana");    
fruitList.add("Apple");    
fruitList.add("Strawberry");    
//Converting ArrayList to Array  
String[] array = fruitList.toArray(new String[fruitList.size()]);    
System.out.println("Printing Array: "+Arrays.toString(array));  
System.out.println("Printing List: "+fruitList);










	}

}
