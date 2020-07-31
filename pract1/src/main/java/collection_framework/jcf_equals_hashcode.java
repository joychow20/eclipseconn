package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class jcf_equals_hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee emp=new employee(123);
employee emp2=new employee(123);
System.out.println(emp.equals(emp2));
Map<employee,String>map=new HashMap<employee,String>();
map.put(emp,"joy");
map.put(emp2, "raya");
System.out.println(emp.hashCode()+"   "+emp2.hashCode());
System.out.println(map.size());
for(Map.Entry e:map.entrySet()) {
	System.out.println(e.getKey()+""+e.getValue());
}
	}

}

