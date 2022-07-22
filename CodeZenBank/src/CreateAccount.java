
public class CreateAccount {

	public static void main(String[] args) {
		
		Account firstAccount = new Account();
		firstAccount.deposit(200);
		System.out.println(firstAccount.getBalance());
		
		firstAccount.deposit(50);
		System.out.println(firstAccount.getBalance());
		
		Account secondAccount = new Account();
		secondAccount.deposit(100);
		System.out.println(secondAccount.getBalance());
		
		System.out.println("The First account has a balance of $" + firstAccount.getBalance() + " dollars");
		System.out.println("The Second account has a balance of $" + secondAccount.getBalance() + " dollars");
		System.out.println("The Bank Code number is " + firstAccount.getBankCode());
		System.out.println("The Account number is " + firstAccount.getAccountNumber());
		System.out.println("The Card Holder name is " + firstAccount.getCardHolder());
	}
	
}
