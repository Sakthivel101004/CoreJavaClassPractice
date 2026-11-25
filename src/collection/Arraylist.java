package collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
	
		ArrayList<String> arr=new ArrayList<>();
		arr.add("sakthi");
		arr.add("vel");
		arr.add("kishore");
		System.out.println(arr);
		System.out.println(arr.get(0));
		arr.set(2, "velan");
		
		System.out.println(arr);
		arr.clear();
		System.out.println(arr.size());

		System.out.println(arr.isEmpty());
System.out.println(arr.contains("vel"));
		}

}
