
public class Account {

	private double balance;
	private int bankCode;
	private int accountNumber;
	private Customer cardHolder;	

	public void deposit(double value) {
		
		this.balance += value;
		
	};
	
	public boolean withdraw(double value) {
		
		if (this.balance >= value) {
			
			this.balance -= value;
			return true;
			
		} else {
			
			System.out.println("You do not have enough money");
			return false;
			
		}
	};
	
	public boolean transfer(double value, Account destination) {
		
		if (this.balance >= value) {
				
			this.balance -= value;
			destination.deposit(value);
			return true;
				
		} else {
				
			System.out.println("You do not have enough money");
			return false;
			
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Customer getCardHolder() {
		return this.cardHolder;
	}
	public void setCardHolder(Customer newCardHolder) {
		this.cardHolder = newCardHolder;
	}
	
	
}