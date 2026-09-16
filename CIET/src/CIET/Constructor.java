package CIET;
class Animal {
	Animal() {
		System.out.println("Animal");
	}
	Animal(int a) {  //constructor overloading -> constructor won't be inherited but the variables or value can be changed using same constructor
		System.out.println("A value is : " + a);
	}
}
//constructor

public class Constructor {
	
	public static void main(String[] args) {
		new Animal();
		new Animal(9);
	}
}