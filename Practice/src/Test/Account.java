package Test;

public class Account {
	private String acc_holder;
	private int balance;
	
	public Account() {
		this.acc_holder = "test";
		this.balance = 1000;
	}
	public Account(String name, int balance) {
		this.acc_holder = name;
		this.balance = balance;
	}
	
	public String getAccHolder() {
		return acc_holder;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setAccHolder(String name) {
		this.acc_holder = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void withdrawal(int amt) {
		if(amt > this.balance && this.balance - amt < 1000) {
			System.out.println(this.acc_holder +"you can't withdraw money");
		}
		else {
			this.balance = this.balance - amt;
			System.out.println(this.acc_holder + " withdrawed " + amt);
			System.out.println("Remaining balace is " + this.balance);
		}
	}
	public void deposite(int amt) {
		this.balance = this.balance + amt;
		System.out.println("balance is " + this.balance);
	}
	
}
