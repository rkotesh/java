package CIET;

class Collection {
		
		static void printArray(int... numbers) { // giving this array as input to the main method 1D -> where args ... array => same as [] == ...
			for (int number:numbers) {
				System.out.println(number + " ");
			}
		}
		public static void main(String[] args) {
			int[] numbers = {10, 20, 400, 5083};
			printArray(numbers);
		}
	
	}
	
	

