
public class Account {

	private double balance;
	private int bankCode;
	private int accountNumber;
	private Customer cardHolder;
	private static int countAccounts = 0;
	
	public Account(int bankCode, int accountNumber) {
		 Account.countAccounts++;
		 this.bankCode = bankCode;
		 this.accountNumber = accountNumber;
		 System.out.println("Creating a new Account: " + accountNumber + " Bank Code: " + bankCode);
		 System.out.println("Exists " + Account.countAccounts + " Accounts");
		 System.out.println();
	}
	
	public Account() {
		 countAccounts++;
		 System.out.println("Exists " + countAccounts + " Accounts");
		 System.out.println();
	}

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
		if(bankCode <= 0) {
			System.out.println("This action could't be executed");
			return;
		}
		this.bankCode = bankCode;
	}
	
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		if(accountNumber <= 0) {
			System.out.println("This action could't be executed");
			return;

		}
		this.accountNumber = accountNumber;
	}
	
	
	public Customer getCardHolder() {
		return this.cardHolder;
	}
	public void setCardHolder(Customer newCardHolder) {
		this.cardHolder = newCardHolder;
	}
	
	public static int getCountAccounts() {
		return countAccounts;
	}	
}
