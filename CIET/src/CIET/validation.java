package CIET;
class BankAccount {
	private double balance;
	double getBalance() {
		return balance;
	}
	public void deposit (double amount) {
		if(amount > 0) {
			balance += amount;
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
}
public class validation {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(100);
		System.out.println(account.getBalance());
		
		Login log = new Login();
		log.validName("Ram");
		System.out.println(log.getName());
	}
}

//encapsulation without setter  and constructor 


class Login {
	private String name;
	String getName() {
		return name;
	}
	public void validName (String correct) {
		if (correct == "Ram") {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid Name");
		}
	}
	
}