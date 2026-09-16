package CIET;

import java.util.*;

public class strings {
	public static void main(String[] args) {
		
		
		
//		//string literal => value(RHS)
		String s1 = " Hello Ram ";
		String s2 = new String("WELCOME RAM").concat(" KOTESWARA RAO"); //concat() - method
		//upper & lower cases
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		char[] letter = {'j', 'a', 'v', 'a'};
		String s3 = new String(letter);
	
		byte[] data = {65, 75, 90, 91};
		String s4 = new String(data);
		int s = s4.length(); //length of a string
		
		String l = s1.trim();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s);
		System.out.println(l);

		String s5 = new String("Hello Ram");
		if ( s1 == s5) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}

		System.out.println(s1.length());
//		

	}
}
