package CIET;

public class minmax {
	
	static int findMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i <arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {5, 7, 3, 1, 9};
		System.out.println("Maximum Number is : " + findMax(a));
		System.out.println("Minimum Number is : " + findMin(a));
		
		
		
		
		
		
		
		
		
		
//		int [] arr = {5,3,2,6,8};
//		int max = arr[0];
//		int min = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("minimum : " + min);
//		System.out.println("maximum : " + max);
	}
}
