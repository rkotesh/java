package Demo;

public class Reverse_Linkedlist {
	static class Node {
		int data;
		Node next;
		Node(int data) { this.data = data; }
	}

	Node head;

	void insertatEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	void reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		Reverse_Linkedlist list = new Reverse_Linkedlist();

		list.insertatEnd(10);
		list.insertatEnd(20);
		list.insertatEnd(30);
		list.insertatEnd(40);

		System.out.println("Original: ");
		list.display();

		list.reverse();

		System.out.println("Reversed: ");
		list.display();
	}
}
