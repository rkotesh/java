package CIET;
import java.util.*;

public class javaset {
	// 
			static class Company {
				int id;
				String name;
				double salary;
				Company(int id, String name, double salary) {
					this.id = id;
					this.name = name;
					this.salary = salary;
					
				}
				@Override
				public String toString() {
					return id + " " + name + " " + salary;
				}
				
			}
	public static void main(String[] args) {
		
		//hash set
		HashSet<String> li = new HashSet<>();
		li.add("KTM Adventure 390");
		li.add("Duke 200");
		li.add("Unicorn");
		li.add("Unicorn"); // duplicate value not given in output
		System.out.println(li);
		
		System.out.println(li.contains("Duke 200"));
		
		li.remove("Unicorn");
		System.out.println(li);
		
		
		//linked hash set
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		ls.add("Ram");
		ls.add("Koti");
		ls.add("Nari");
		ls.add("Nari"); // duplicate value not given in output
		System.out.println(ls);
		
		ls.addFirst("kittu");
		System.out.println(ls);
		System.out.println(ls.contains("Ram"));
		
		ls.getFirst();
		System.out.println(ls);
		
		ls.remove("Ram");
		System.out.println(ls);
		
		ArrayList<String> index = new ArrayList<>(ls);
		System.out.println(index.get(1));
		System.out.println(index.indexOf("Koti"));
		
		
		//tree set
		TreeSet<Integer> phone = new TreeSet<>();
		phone.add(20);
		phone.add(90);
		phone.add(54);
		phone.add(23);
		System.out.println(phone);
		
		System.err.println(phone.first());
		System.out.println(phone.last());
		
		
		// 
		List<String> user = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
			user.add("Users " + i);
		}
		int page = 3;
		int pageSize = 10;
		int start = (page - 1) * pageSize;
		int end = Math.min(start + pageSize, user.size());
		List<String> result = user.subList(start, end);
		System.out.println(result);
		
		List<Company> emp = Arrays.asList(
                new Company(1, "Ram", 3400000),
                new Company(2, "Koti", 540000),
                new Company(3, "Nandu", 8900000)
        );
		for (Company cp:emp) {
			System.out.println(cp);
		}
		
		
		
	}
}
