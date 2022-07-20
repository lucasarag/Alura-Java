
public class Account {

	int bankCode;
	int accountNumber;
	String cardHolder;
	double balance;
	
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
	
	public boolean transfer(double value, Account destiny) {
		
		if (this.balance >= value) {
				
			this.balance -= value;
			destiny.deposit(value);
			return true;
				
		} else {
				
			System.out.println("You do not have enough money");
			return false;
			
		}
		
	}

}
