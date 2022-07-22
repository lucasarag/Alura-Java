
public class NegativeWithdrawalTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.deposit(100);
		account.withdraw(200);
		System.out.println(account.getBalance());
		
	}
}
