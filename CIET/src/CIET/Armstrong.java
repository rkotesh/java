package CIET;
class animala {
	void sound() {
		System.out.println("animal makes sounds");
	}
}
class Doga extends animala {
	@Override
	void sound() {
		System.out.println("dog barks");
	}
}
class Cata extends animala {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

public class Armstrong {
	public static void main(String[] args) {
        animala animal; 
        
        animal = new Doga(); // method name should be same and need to be overridden
        animal.sound();
        animal = new Cata(); 
        animal.sound(); 
	}
		
}
