package CIET;

interface vehical {
	void start();
	void stop();
}

class car implements vehical {
	@Override
	public void start() {
		System.out.println("Car starts with a key");
	}
	@Override
	public void stop() { //public => access modifier
		System.out.println("Car stops using breaks");
	}
}

class bike implements vehical {
	@Override
	public void start() {
		System.out.println("Bike has two wheels");
	}
	@Override // annotation
	public void stop() {
		System.out.println("Bike stops when it is out of fuel");
	}
}

class bus implements vehical {
	@Override
	public void start() {
		System.out.println("Bus has 6 wheels");
	}
	@Override // annotation
	public void stop() {
		System.out.println("Bus stops when it is out of fuel");
	}
}

public class Vehicle {
	public static void main(String[] args) {
		vehical a;  // object reference, because the methods are same for all the classes
		a = new car();
		a.start();
		a.stop();
		a = new bike();
		a.start();
		a.stop();
		a = new bus();
		a.start();
		a.stop();
	}
}
