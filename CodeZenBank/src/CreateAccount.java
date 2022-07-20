
public class CreateAccount {

	public static void main(String[] args) {
		
		Account firstAccount = new Account();
		firstAccount.balance = 200.00;
		System.out.println(firstAccount.balance);
		
		firstAccount.balance += 50.0;
		System.out.println(firstAccount.balance);
		
		Account secondAccount = new Account();
		secondAccount.balance = 100.00;
		System.out.println(secondAccount.balance);
		
		System.out.println("The First account has a balance of $" + firstAccount.balance + " dollars");
		System.out.println("The Second account has a balance of $" + secondAccount.balance + " dollars");
		System.out.println("The Bank Code number is " + firstAccount.bankCode);
		System.out.println("The Account number is " + firstAccount.accountNumber);
		System.out.println("The Card Holder name is " + firstAccount.cardHolder);
	}
	
}
