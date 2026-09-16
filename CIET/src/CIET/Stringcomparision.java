package CIET;

class Stringcomparision {
	public static void main(String[] args){
		
		//comparison between equals and ==
		
		String a = "java";
		String b = new String("Lava");
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.compareTo(b));
		System.out.println(a==b);
		
		

	}
}
