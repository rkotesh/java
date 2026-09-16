package CIET;


interface Animalu {
	void sound();
	default void stop() { // creates inside an interface
		System.out.println("animals stops when they saw humans");
	}
}
class Dog implements Animalu {
	public void sound() {
		System.out.println("dog barks");
	}
}
class javapackages {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.stop();
	}
}

