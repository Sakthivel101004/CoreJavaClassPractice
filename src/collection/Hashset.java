package collection;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> hash=new HashSet<String>();
		
		hash.add("sakthi");
		hash.add("bhuvan");
		hash.add("velan");
		System.out.println(hash);
		hash.remove("sakthi");
		System.out.println(hash);
System.out.println(hash.contains("sakthi"));
System.out.println(hash.isEmpty());
hash.clear();
hash.size();

System.out.println(hash);
	}

}
