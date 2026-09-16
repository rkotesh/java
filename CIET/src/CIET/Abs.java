package CIET;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;


public class Abs {
	    public static void readFile() throws IOException {
	        FileReader file = new FileReader("./data.txt");
	        BufferedReader reader = new BufferedReader(file);
	        String line;
	        while ((line = reader.readLine()) != null) {
	        	System.out.println(line);
	        }
	        reader.close();
	        file.close();
	    }

	    public static void main(String[] args) throws IOException {
	        readFile();
	    }
	    
	}
		
		











//		//exception handling
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = a/b;
//		System.out.println(c);
//		
//		// exception with try-catch block
//		try {
//			int result = 10/0;
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage()); // error stored inside 'e'   		//catch with exception object
//			e.printStackTrace(); //exact error
//		}
//		
//		//multiple catch block
//		
//		try {
//			int[] arr = {10, 20, 40};
//			System.out.println(arr[5]);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("Complete");
//		}
//		
//		
//		
//		int age = 17;
//		if(age < 18) {
//			throw new IllegalArgumentException("Age must be above 18");
//		}
//		
		// throws
		
		
	
	

