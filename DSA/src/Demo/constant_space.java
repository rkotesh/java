package Demo;

public class constant_space {
	
	//O(1) space complexity
	static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println(result);
	}
}

