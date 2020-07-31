package collection_framework;


import java.util.LinkedList;
import java.util.List;

import org.apache.commons.collections.iterators.ReverseListIterator;


public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="joydeep";
char []strarray=str.toCharArray();
List<Character>l=new LinkedList<Character>();
for(char r:strarray ) {
	l.add(r);
}
System.out.println(l);
java.util.ListIterator<Character> ltr=l.listIterator();
ReverseListIterator reverseListIterator = new ReverseListIterator(l);

while(reverseListIterator.hasNext()) {
	System.out.println(reverseListIterator.next());
	
}
	}

}
