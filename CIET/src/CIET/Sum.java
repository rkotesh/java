package CIET;

public class Sum {
	static int sum(int... numbers) {
		int total = 0;
		for(int number:numbers) {
			total += number;
		}
		return total;	
	}
	public static void main(String[] args) {
		int[] numbers = {22, 45};
		int a = sum(numbers);
		System.out.println(a);
		
	}
}
