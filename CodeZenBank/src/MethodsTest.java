
public class MethodsTest {
	
	public static void main(String[] args) {
		
		Account lucasAccount = new Account();
		lucasAccount.balance = 100;
		System.out.println("Your balance is $" + lucasAccount.balance);
		System.out.println();
		
		lucasAccount.deposit(50);
		System.out.println("After the deposit, your balance is $" + lucasAccount.balance);
		System.out.println();
		
		lucasAccount.withdraw(20);
		boolean successfulWithdrawal = lucasAccount.withdraw(20);		
		if(successfulWithdrawal) {
			
			System.out.println("After the withdrawal, $" + lucasAccount.balance + " remains in your balance");
			System.out.println();
			
		}
		
		Account auroraAccount = new Account();
		auroraAccount.deposit(1000);
		System.out.println("Your balance is $" + auroraAccount.balance);
		System.out.println();
		
		System.out.println("Your balance is $" + lucasAccount.balance);
		System.out.println();
		
		if(auroraAccount.transfer(300, lucasAccount)) {
		
		System.out.println("After sending the transfer, your balance is $" + auroraAccount.balance);
		System.out.println("After receiving the transfer, your balance is $" + lucasAccount.balance);
		
		}
	}
	
}
