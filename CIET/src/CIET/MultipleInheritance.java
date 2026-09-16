package CIET;

public class MultipleInheritance {
	//hierarchical inheritance
	static class Animal {
		void eat() {
			System.out.println("Animal is eating");
		}
	}
	static class Dog extends Animal {
		void bark() {
			System.out.println("Barking");
		}
	}
	static class Cat extends Animal {
		void Meow() {
			System.out.println("Meowing");
		}
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.bark();
		d.eat();
		c.Meow();
		c.eat();
	}
}
