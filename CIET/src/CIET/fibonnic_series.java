package CIET;
import java.util.Scanner;

public class fibonnic_series {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		// fobinnaic_series
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		
		System.out.println("Fibonacci series");
		
		for (int i = 1; i <= n; i++) {
			System.out.println(a + " ");
			int c = a + b;
			a = b; 
			b = c; 
		}
	}
}


//int [] a = new int[5];
//System.out.println(a.getClass());
//System.out.println(a[0]);
//System.out.println(a.length);

//a[0] = 1;
//a[1] = 2;
//a[2] = 3;
//a[3] = 4;
//a[4] = 5;
// a[5] = 6;
//System.out.println(a[0]);
// System.out.println(a[5]); error


// array reference vs object
//int [] n = { 10, 20, 30};
//int [] b = n.clone();
//b[0] = 100;
//b[1] = 200;
//b[2] = 300;
//System.out.println(n.toString());
//System.out.println(n[1]);
//System.out.println(n[2]);
//System.out.println(b[0]);
//System.out.println(b[1]);
//System.out.println(b[2]);



//
//int numbers[] = {10, 20, 30, 40};
//System.out.println(Arrays.toString(numbers));
//


//command line argument & single dimensional array

//System.out.println("Array before sorting : ");
//System.out.println(Arrays.toString(numbers));
//
//System.out.println("Array after sorting : ");

//Arrays.sort(numbers, 1, 6);
//System.out.println(Arrays.toString(numbers));


//
//int numbers[] = {10, 22, 56, 35, 89, 99, 65};
//int target = 89; // if the element is not the array, it gives negative index
//int index = Arrays.binarySearch(numbers, target);
//System.out.println(index);
//