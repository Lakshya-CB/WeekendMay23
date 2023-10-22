package Lec_HM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class hashmap_demo {
	public static void main(String[] args) {
//	HashMap<Key,Value> HM = new HashMap<>();
		HashMap<String, Integer> HM = new HashMap<>();
		HM.put("A", 10); //O(1)
		HM.put("BA", 2); 
		HM.put("BCXZ", 7);
		HM.put("Chaman", 17);
		HM.put("Chomu", null);
		
		System.out.println(HM);
		System.out.println(HM.get("Chaman")); //O(1)
		
		System.out.println(HM.containsKey("Chomu")); //O(1)
		System.out.println(HM.get("Chomu"));
		
		HM.put("Chaman", 170); // pair add and update!!
		System.out.println(HM);
		
		HM.remove("A"); //O(1)
		System.out.println(HM);
//		HM => Traversal and Keys
		
		System.out.println(HM.keySet());
		
		Set<String> Keys = HM.keySet();
		System.out.println(Keys);
		ArrayList<String> AL = new ArrayList<>(Keys);
		System.out.println(AL);
		
		System.out.println("=============");
		for(String key : HM.keySet()) {
			System.out.println(key +"=>"+HM.get(key));
		}
		

	}
}
