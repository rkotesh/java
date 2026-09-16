package CIET;

public class Javainheritence {
	
	static class Animal {
		void eat() {
			System.out.println("Animal is eating");
		}
		//method overriding
		void sleep() {
			System.out.println("Sleep");
		}
		
	}
	 
	//single inheritance
	static class Dog extends Animal{
		void bark() {
			System.out.println("Dog barks");
		}
		
		@Override
		void sleep() {
			System.out.println("Dog is sleeping");
		}
		
	}
	
	static class Cat extends Dog {
		void Meow() {
			System.out.println("Cat Meows");
		}
	}
	
	static class Rat extends Cat {
		void Sit() {
			System.out.println("Rat sits");
		}
	}
	
	public static void main(String[] args) {
		Rat r = new Rat();
		r.bark();
		r.eat();
		r.Sit();
		r.Meow();
		r.sleep();
	}
}





