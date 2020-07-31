package Barclays_Client;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount_hashmap {

	public static void method(String str1) {
		String str=str1.replaceAll("\\s", "");//to remove white spaces in between a string 
		char[] strarray = str.toCharArray();
		Map<Character, Integer> charmap = new LinkedHashMap<Character, Integer>();
	//so that it follows insertion order	
		for (char c : strarray) {
			if (charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c) + 1);
			} else {
				charmap.put(c, 1);
			}
		}
//		Map<Character, Integer> llmap=new LinkedHashMap<Character,Integer>(charmap);
//		System.out.println(llmap);
			for (Map.Entry entry : charmap.entrySet()) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
		}
	
	public static void method_(String str) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abhijit";
		char j[] = s.toCharArray();
		for (char c : j) {
			System.out.println(c);
		}
		method("joydeep chowdhury");
	}

}
