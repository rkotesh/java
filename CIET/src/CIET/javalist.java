package CIET;
import java.util.*;
public class javalist {
	public static void main(String[] args) {
		
		//linked list
		LinkedList<String> cars = new LinkedList<>();
		cars.add("BMW");
		cars.add("Benz");
		cars.add("Audi");
		cars.add("Volvo");
		System.out.println(cars);
		
		//dequeue operations
		cars.addFirst("Lamborghini");
		cars.addLast("Suzuki");
		System.out.println(cars);
		
		cars.removeLast();
		System.out.println(cars);
		
		System.out.println(cars.getFirst());
		
		System.out.println(cars.get(2));
		
		cars.remove("Volvo");
		System.out.println(cars);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// ArrayList
//		ArrayList<Integer> numbers = new ArrayList<>();
//		numbers.add(10);
//		numbers.add(32);
//		numbers.add(null);
//		System.out.println(numbers);
//		System.out.println(numbers.get(0));
//		numbers.remove(Integer.valueOf(10));
//		System.out.println(numbers);
		
		
	//	List<Object> mixedList = new ArrayList<>();
//		mixedList.add("ram");
//		mixedList.add("koti");
//		mixedList.add(89);
//		mixedList.add(34);
//		System.out.println(mixedList);
//		for (Object item:mixedList) {
//			if (item instanceof String) {
//				String str = (String)item;
//				System.out.println(str);
//			}
//			else if (item instanceof Integer) {
//				int n = (Integer)item;
//				System.out.println(n);
//			}
//		}
		
//		List<Integer> names = new ArrayList<>();
//		names.add(10);
//		names.add(90);
//		names.add(990);
//		names.add(90);
//		System.out.println(names);
//		System.out.println(names.get(2));
//		names.set(2, 100);
//		System.out.println(names);
//		names.remove(3);
//		System.out.println(names);
	}
}
