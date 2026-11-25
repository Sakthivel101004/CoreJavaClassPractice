package collection;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hash=new HashMap<>();
		
		hash.put(1, "sakthi");
		hash.put(2, "mani");
		hash.put(3, "three");
		hash.put(2, "vel");
		
		System.out.println(hash);
		
		hash.remove(3);
		System.out.println(hash);
		hash.replace(2, "velan");
		System.out.println(hash);
		hash.replace(null, null, null);
		hash.containsKey(hash);
		hash.containsValue(hash);
	}

}
