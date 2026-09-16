package CIET;

interface animl {
	void eat();
}

interface rat {
	void barks();
}
class cow implements animl, rat {

	public void barks() {
		System.out.println("dog barks");
	}

	public void eat() {
		System.out.println("Animal eats");
	}
}
class javainterface {
	public static void main(String[] args) {
		cow c = new cow();
		c.eat();
		c.barks();
	}
}

