package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList (java.util) class
		ArrayList<String> arrayList = new ArrayList<String>();
		// 2. Add five Strings to your list
		arrayList.add("This is new to me");
		arrayList.add("Interesting");
		arrayList.add("Fascinating");
		arrayList.add("The starting number at 0 is messing me up.");
		arrayList.add("The order goes in how I put it in the list?");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		// 4. Print all the Strings using a for-each loop
		for (String s : arrayList) {
			System.out.println(s);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < arrayList.size(); i += 2) {
			System.out.println(arrayList.get(i));
		}
		// 6. Print all the Strings in reverse order.
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			System.out.println(arrayList.get(i));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).contains("e")) {
				System.out.println(arrayList.get(i));
			}
		}
	}
}
