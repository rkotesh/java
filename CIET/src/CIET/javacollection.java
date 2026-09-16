package CIET;
import java.util.ArrayList;
import java.util.Collection;


public class javacollection {
	public static void main(String[] args) {
		Collection<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("Koti");
		names.add("chinna deyyam");
		names.add("pedda deyyam");
		names.add("Buddamma");
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.contains("Ram"));
		names.remove("koti");
		System.out.println(names);
		System.out.println(names.isEmpty());
		names.clear();
		System.out.println(names);
	}
}
