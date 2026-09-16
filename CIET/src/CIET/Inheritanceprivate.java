package CIET;

class Parent {
	 // private int x = 9;
	  private int x = 9;
	  public int get() {  // get gives only one value & also return one value
		  return x;
	  }
}
class child extends Parent {
	void show() {
		System.out.print(get());
	}
}

public class Inheritanceprivate {
	public static void main(String[] args) {
		child c = new child();
		c.show();
	}
}



//package CIET;
//
//class parent {
//	parent() {
//		System.out.println("Inside Constructor");
//	}
//	void son() {
//		System.out.println("Inside Son");
//	}
//}
//
//class Child extends parent {
//	Child() {
//		super();
//		System.out.println("Inside child class");
//	}
//}
//
//public class constructorsuper {
//	public static void main(String[] args) {
//		Child c = new Child();
//		
//	}
//}
//
