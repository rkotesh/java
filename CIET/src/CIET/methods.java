package CIET;

public class methods {

    // Method
//	int dog() {
//		return a + b;
//	}
	
//	void tree(String name) {
//		System.out.println("Name : " + name);
//	}
//    static void print() {
//    	System.out.println("Ram");
//    }

	
//	double ciet(int a, int b, double c) {
//		return a + b + c;
//	}
	
	
	static int human() {
		int a = 90;
		int b = 70;
		int c = a + b;
		return c;
	}
	public static void main(String[] args) {
       
        //types of methods 
    	// 1. method without return type and without parameters
        // print();				if i don't use object creation i use static -> belongs to the class
        
    	// 2. method without return type and with parameters
//        methods r = new methods();
//        r.tree("chakri");
//        r.tree("Ram");
        
    	// 3. method with return type and with parameters
//		methods r = new methods();
//		double a = r.ciet(10, 120, 40.5);
//		System.out.println(a);
		
		
    	// 4. method with return type and without parameters
		int m = human();
		System.out.println(m);

		
    }
}