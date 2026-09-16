package CIET;

public class stringcontains {
	public static void main(String[] args) {
		
		//contains & starts with
		
		String a =  ("java, c, python");
		boolean b = a.contains("java");
		boolean c = a.startsWith("java");
		boolean e = a.endsWith("java");
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
	}
}
