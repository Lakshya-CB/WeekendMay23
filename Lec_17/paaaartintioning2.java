package Lec_17;

import java.util.ArrayList;

public class paaaartintioning2 {
	public static void main(String[] args) {
		kaat("abc", "", new ArrayList<>());
		
	}

	public static void kaat(String table, String bag,ArrayList<String> AL_bag) {
		if(table.isEmpty()) {
			System.out.println(bag);
			System.out.println(AL_bag);
			System.out.println("===========");
			return;
		}
//		table => abcd
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0,chakku);
			String remain = table.substring(chakku);

//			Sol 1: AL=> Immutable!!
//			ArrayList<String> new_bag = new ArrayList<>(AL_bag);
//			new_bag.add(piece);
//			Sol 2 : Explicitly Undo the changes !! = > prep 
			AL_bag.add(piece);
			kaat(remain, bag+"-"+piece,AL_bag);
			AL_bag.remove(AL_bag.size()-1);
			
			
		}
	}
}
