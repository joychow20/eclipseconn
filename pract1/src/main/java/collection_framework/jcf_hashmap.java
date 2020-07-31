package collection_framework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class jcf_hashmap {

	public static void hasmap() {
		System.out.println(":::::::::::::::::::::");
	Map<Integer, String> map = new HashMap<Integer,String>();
	map.put(1, "One");
	map.put(2, "Two");
	map.put(null, "value");
	map.put(null, "value3333");
	map.put(45, null);
	map.put(88, null);
	for (Integer key : map.keySet()) {
		System.out.println(key);
	}
	System.out.println(map);
	System.out.println(":::::::::::::::::::::");
	}
	public static void hastable() {
		Hashtable<Integer,String>ht=new Hashtable();
		ht.put(1,"joydeep");
		ht.put(2,"pooo");
		ht.put(8,"raya");
	//	ht.put(9999, null);
		System.out.println("key set"+ht.keySet());
		System.out.println("value set"+ht.values());
		System.out.println("Entry set"+ht.entrySet());
		System.out.println(ht);
		for(Map.Entry me:ht.entrySet()) {
			System.out.println("get key"+me.getKey()+""+"get value"+me.getValue());
		}
		}
	public static void linkedhashmap() {
		LinkedHashMap<Integer,String>lhm=new LinkedHashMap<Integer,String>();
		lhm.put(34, "harry");
		lhm.put(24,"kobe");
		lhm.put(23, "Michael");
		System.out.println("linkedhashMap"+lhm);
		for(Map.Entry me:lhm.entrySet()) {
			System.out.println(me);
		}
	}
	public static void treemap() {
		System.out.println("___________________________________________________");
		Map<Integer,String>tm=new TreeMap<Integer,String>();
		tm.put(23, "value");
		tm.put(21,"david");
		tm.put(20,"victoria");
		tm.put(22,"charlie");
		//tm.put(null,"ko");
		tm.put(90,null);
		tm.put(91,null);
		//tm.put(null, "lolo");
		System.out.println("the tree map"+tm);
		System.out.println("___________________________________________________");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*hashtable is same as hahmap woring wise
		 * null values of key and value is not allowed in hashtable it will give you null pointer exception
		 * hashtable is thread safe i.e.it is synchornized
		 * slower than hashmap  
		 */
		treemap();
		linkedhashmap();
		hastable();
		hasmap();
HashMap<Integer,String>hm=new HashMap<Integer,String>();
hm.put(22, "joy");//removes the first set if duplicate key is found
hm.put(23, "oy");
hm.put(2, "y");
hm.put(21, "joy");
hm.put(22, "hi");//keeps the latest key
hm.put(null, "ki");//only one null key is allowed
hm.put(89,null);
hm.put(null, "ko");//keeps the latest null key
System.out.println(hm);
for (Integer key : hm.keySet()) {
	System.out.println(key);
}
for(String va:hm.values()) {
	System.out.println(va);
}
for(Map.Entry m:hm.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
}
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.putAll(hm);
map.putIfAbsent(898, "agdumbagdum");
System.out.println(map);
for(Map.Entry k:map.entrySet()) {
	System.out.println(k.getKey() +""+ k.getValue());
}
map.putIfAbsent(8888888, "lolo");
map.putIfAbsent(89, "popo");
System.out.println(map);
System.out.println(map);
for( Integer l:map.keySet()) {
	System.out.println("the keys");
	System.out.println(l);
}
for(String h:map.values()) {
	System.out.println("The values");
	System.out.println(map.get(h));
}
	}

}
