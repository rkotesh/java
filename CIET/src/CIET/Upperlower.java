package CIET;

import java.util.Scanner;

public class Upperlower {
	public static void main(String[] args) {
		
		//difference b/w next() & nextLine()
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.nextLine();
		System.out.println(a);
		System.out.println(b);
		
		//upper & lower case
		String s1 = "ramkoti";
		String s2 = "RAM";
		
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
	}
}
