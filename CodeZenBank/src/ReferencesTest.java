
public class ReferencesTest {
	
	public static void main(String[] args) {
		
		Account firstAccount = new Account();
		firstAccount.balance = 300;
		System.out.println("The First account has a balance of $" + firstAccount.balance + " dollars");
		
		
		Account secondAccount = firstAccount;
		System.out.println("The Second account has a balance of $" + secondAccount.balance + " dollars");
		
		secondAccount.balance += 100;
		System.out.println("The Second account has a balance of $" + secondAccount.balance + " dollars");
		System.out.println("The First account has a balance of $" + firstAccount.balance + " dollars");
		
	}

}
