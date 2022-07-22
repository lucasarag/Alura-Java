

public class ReferencesTest {
	
	public static void main(String[] args) {
		
		Account firstAccount = new Account();
		firstAccount.deposit(300);
		System.out.println("The First account has a balance of $" + firstAccount.getBalance() + " dollars");
		
		
		Account secondAccount = firstAccount;
		System.out.println("The Second account has a balance of $" + secondAccount.getBalance() + " dollars");
		
		secondAccount.deposit(100);
		System.out.println("The Second account has a balance of $" + secondAccount.getBalance() + " dollars");
		System.out.println("The First account has a balance of $" + firstAccount.getBalance() + " dollars");
		
	}

}
