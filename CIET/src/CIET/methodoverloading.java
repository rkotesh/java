package CIET;

public class methodoverloading {

//	void add(int a) {
//		System.out.println(a);
//	}
//	void add(double a) {
//		System.out.println(a);
//	}
//	void add(int a, int b) {
//		System.out.println(a + b);
//	}
//	void add(int b, double c) {
//		System.out.println(b * c);
//	}
	
	
	

    static int calculateArea(int side) { 
        return side * side; 
    } 

    static int calculateArea(int length, int width) { 
        return length * width; 
    } 

    static double calculateArea(double radius) { 
        return Math.PI * radius * radius; 
    } 

    public static void main(String[] args) { 
        
        System.out.println("Square: " + calculateArea(12));
        System.out.println("Rectangle: " + calculateArea(5, 10));
        System.out.println("Circle: " + calculateArea(12.5));
   
		
		
//		n.add(10);
//		n.add(20, 90);
//		n.add(20.9);
//		n.add(30.5);
	}
}

