
public class ValuesTest {

	public static void main(String[] args) {
		
		Account account = new Account(0001, 12345);
		
		account.setBankCode(-120);
		account.setAccountNumber(-120);
		
		System.out.println(account.getBankCode());
		System.out.println(account.getAccountNumber());
		
		Account account2 = new Account(0001, 6666);
		Account account3 = new Account(2121, 9878);
		
		System.out.println(Account.getCountAccounts());
	}
}
